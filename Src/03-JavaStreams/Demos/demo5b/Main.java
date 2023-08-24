package demo5b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Max Min
public class Main {

	public static void main(String[] args) {
		
		List<Integer> data = Arrays.asList(3,2,9,4,3,9,4,1,9,0,3,5,4,2,7,6);
		Comparator<Integer> comparator = Comparator.comparing(Integer::intValue);
		
		Optional<Integer> minOptional = data.stream()
		.map(x -> {System.out.print(" " + x); return x;})
		.min(comparator);
		 
		minOptional.ifPresent(e -> System.out.println("\nMin: " + e));
		
		Optional<Integer> maxOptional = data.stream()
				.map(x -> {System.out.print(" " + x); return x;})
				.max(comparator);
		
		maxOptional.ifPresent(e -> System.out.println("\nMax: " + e));
	}

}
