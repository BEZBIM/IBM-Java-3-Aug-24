package Unshared;

class MyObject {
	String name = null;
	MyObject(String s) {
		this.name = s;
	}
}

class Task implements Runnable {
	MyObject obj = null;
	String name = null;
	Task(String n) {
		this.name = n;
		this.obj = new MyObject(n);
	}
	@Override
	public void run() {
		System.out.println("      Thread " + this.name + " using MyObject " + this.obj);
		
	}
	
}
public class Runner {

	public static void main(String[] args) {
	Thread t1 = new Thread(new Task("Alpha"));
	Thread t2 = new Thread(new Task("Beta"));
    t1.start();
    t2.start();
	}

}
