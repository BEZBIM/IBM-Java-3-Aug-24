package demo3a;

import java.util.Arrays;
import java.util.List;


//Lazy Invocation demo

public class Main {
	static int counter = 0;
	static void count() { counter++;}
	
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7);
		
		// Added terminal method
		data.stream()
			.filter( x -> { 
							count(); 
							return (0 == x % 2);
							})
			.forEach(System.out::println);
		
		System.out.println("Total elements processed = " + counter );

	}
}
