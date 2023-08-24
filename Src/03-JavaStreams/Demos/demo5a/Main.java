package demo5a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
// reducers demo
public class Main {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(3,2,9,4,3,9,4,1,9,0,3,5,4,2,7,6);
		long result;
		
		result =
		data.stream()
		.peek(x -> System.out.print(" " + x))
		//.forEach(x -> {return;} );
		.count();

		System.out.println("\n Result = " + result);
     

	}

}
