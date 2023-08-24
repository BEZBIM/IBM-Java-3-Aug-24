package demo7;

import java.util.function.Function;

public class Main {

	public static int id = 3;
	
	public static Function<Integer,Integer> f; 
	public static void main(String[] args) {
       f = makef();
       System.out.println(f.apply(1));
       id = 4;
       System.out.println(f.apply(1));
       
	}
    private static Function<Integer,Integer> makef() {
    	return x -> x + Main.id;
    }
}
