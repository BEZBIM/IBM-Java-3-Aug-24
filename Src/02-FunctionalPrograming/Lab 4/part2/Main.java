package part2;

public class Main {

	public static void main(String[] args) {
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
		
		// Using r for readability
		Thread t1 = new Thread(r);
		// passing the function directly
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("MyThread" + Thread.currentThread() + "count=" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();

	}

}
