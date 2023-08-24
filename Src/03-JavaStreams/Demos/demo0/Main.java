package demo0;

import java.util.Arrays;
import java.util.List;

// Notation Demo

public class Main {

	public static void main(String[] args) {
	List<String> mylist = Arrays.asList("Hi","There","World");
    //System.out.println(mylist);
    
    // The procedural way
    for (String s : mylist) {
    	//System.out.println(s);
    }
    
    // The functional way
    mylist.forEach( (x) -> System.out.println(x));
    
    // Using a function name instead of a Lambda
    // syntax is "package::function"
    mylist.forEach(System.out::println);
}
}
