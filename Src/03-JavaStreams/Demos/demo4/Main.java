package demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Pipeline methods demos

public class Main {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(3,2,9,4,3,9,4,1,9,0,3,5,4,2,7,6);
		List<Integer> result = new ArrayList<>();
		
		result = data.stream()
		// .skip(3)
		// .limit(4)
		//.peek(System.out::println)
		//.distinct()
		//.sorted()
		// .limit(4)
		
		.collect(Collectors.toList());
		
		System.out.println(result);

	}

}
