package demo5;

public class Main {

	public static void main(String[] args) {
		
		// The Old Timey OO way
		Func old = new A();
		old.exec();
		
		// The inner class way
		Func f  = new Func() {
			public void exec() {
				System.out.println("The Inner Class Way");
			}
		};
		f.exec();
        
		// The functional Interface way
		// Since there is only one abstract method, there is only one way to 
		// resolve the assignment below.
		Func g = () -> System.out.println("The Functional Interface Way");
		g.exec();
	}

}

@FunctionalInterface
interface Func {
	void exec();
	// note that adding the following method produces a compile error since
	// we no longer have exactly one abstract method
	// void show();
}

class A implements Func {

	@Override
	public void exec() {
		System.out.println("Old Timey OO Way");
		
	}
	
}