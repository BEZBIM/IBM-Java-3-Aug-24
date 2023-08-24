package demo6;

public class Main {

	public static void main(String[] args) {
		// Old school thread creation
		InheritedThread t1 = new InheritedThread();
		Thread t2 = new Thread(new ImplementedThread());
		
		// Using the Runnable functional interface
		Runnable r = () -> System.out.println("Runnable Thread 1 " + Thread.currentThread());
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
		
		// The preferred way to write the runnable thread option - just pass the Lambda right to the
		// Thread constructor
		new Thread(() -> System.out.println("Runnable Thread 2 " + Thread.currentThread())).start();
		

	}

}

class InheritedThread extends Thread {
	public void run() {
		System.out.println("Inherited Thread " + Thread.currentThread());
	}	
}

class ImplementedThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Implemented Thread " + Thread.currentThread());
		
	}
	
}