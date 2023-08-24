package unsync;

public class Counter implements Runnable {
	private int myCount = 0;
	
	public void increment() {
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.err.println(e);
		}
		this.myCount++;
	}
	
	public void decrement() {
		this.myCount--;
	}
	
	public int getValue() {
		return this.myCount;
	}

	@Override
	public void run() {
		this.increment();
		System.out.println("Thread " +Thread.currentThread().getName() + 
				" after increment counter = " + this.getValue());	
		this.decrement();
		System.out.println("Thread " +Thread.currentThread().getName() + 
				" Final value = " + this.getValue());
		
	}
	
	
}
