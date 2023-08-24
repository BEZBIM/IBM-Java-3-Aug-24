package demo4b;

import java.util.function.Function;

public class Main {
    // A better version of the dispatch table
	// using Lambdas showing a more efficient approach
	// Instead of predefining the functions, we just provide a 
	// Lambda functional literal for each case which can then
	// be assigned to a function variable or not.
	
	public static Function<Integer,Integer> f(int power) {
		switch (power) {
		case 1:
			return x -> x;
		case 2:
			return x -> x * x;
		case 3:
			return x -> x * x * x ;
		default:
			return (x) -> 0;
		}
	}
	
	public static void main(String[] args) {
		Function<Integer,Integer> newFunc = f(3);
		// whole bunch of code maybe.//
		System.out.println("Cube: " + newFunc.apply(3));
		System.out.println("Square: " + f(2).apply(3));
	}

}
