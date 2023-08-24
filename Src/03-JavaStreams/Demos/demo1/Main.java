package demo1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

    Function<Integer,Integer> square = x -> x * x;
    // Source Collection
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<Integer> squares =
    		numbers.stream()		// creates the stream object
    		.map(square)			// pipeline method applies the 
    								// square function all the elements in the stream
    		.collect(Collectors.toList()); // Convert the stream to a list
    System.out.println(numbers);  // this as not been changed
    System.out.println(squares);     
	}

}
