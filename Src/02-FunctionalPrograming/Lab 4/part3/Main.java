package part3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// Same as last part
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("MyThread" + Thread.currentThread() + "count=" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		//create a new executor service
		ExecutorService e = Executors.newFixedThreadPool(5);
		e.execute(r);
		e.execute(r);
		e.shutdown();
		
		
	}

}
