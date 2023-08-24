package Demo5c;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(3,2,9,4,3,9,4,1,9,0,3,5,4,2,7,6);
		
		Boolean result;
		
		result = data.stream()
		.map(x -> {System.out.print(" " + x); return x;})
		//.anyMatch(x -> 0 == x % 2);
		//.allMatch(x -> 0 == x % 2);
		//.noneMatch(x -> 0 == x % 2);
		//.allMatch(x -> x < 10);
		.noneMatch(x -> x > 10);
		
		System.out.println("\n"+result);
		

	}

}
