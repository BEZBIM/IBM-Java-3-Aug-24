package demo4a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// Create three lists of integers
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
		
		// Create a list of lists
		List<List<Integer>> listOfListofInts = 
				Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		
		// Print out the list
		System.out.println(listOfListofInts);
		
		// Flatten the list
		List<Integer> listofInts  = 
				listOfListofInts.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		
		System.out.println(listofInts);
		
		
	}

}
