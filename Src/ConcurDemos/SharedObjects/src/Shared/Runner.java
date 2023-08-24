package Shared;



class MyObject {
	String name = null;
	MyObject(String s) {
		this.name = s;
	}
}

class SharedTask implements Runnable {
	MyObject obj = null;
	String name = null;
	SharedTask(MyObject m,String n) {
		this.name = n;
		this.obj = m;
	}
	@Override
	public void run() {
		System.out.println("      Thread " + this.name + " using MyObject " + this.obj);
		
	}
	
}
public class Runner {
	public static void main(String[] args) {
		
		MyObject shared = new MyObject("shared");
		Thread t1 = new Thread(new SharedTask(shared,"Alpha"));
		Thread t2 = new Thread(new SharedTask(shared,"Beta"));
	    t1.start();
	    t2.start();
		}
}
  

