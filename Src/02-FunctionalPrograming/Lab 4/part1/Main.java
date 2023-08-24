package part1;

public class Main {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread ot = new Thread(new MyOtherThread());
        ot.start();
		t.start();

	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyThread" + Thread.currentThread() + "count=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyOtherThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyOtherThread" + Thread.currentThread()+ "count=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}
}
