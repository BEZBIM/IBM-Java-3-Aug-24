package demo5d;

import java.util.Arrays;
import java.util.List;

// Reducers demo
public class Main {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(3,2,9,4,3,9,4,1,9,0,3,5,4,2,7,6);
		
		int result = data.stream()
				.reduce(0, (x,y) -> x + y);           // sum
				//.reduce(-1, (x,y) -> (x > y) ? x : y);  //max
				
				

		System.out.println(result);
	}

}
