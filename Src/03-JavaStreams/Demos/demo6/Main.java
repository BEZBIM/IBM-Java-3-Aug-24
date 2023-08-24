package demo6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	// Collectors Demo
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("To","be","or","not","to","be");
		
		List<String> allWords;
		Set<String> uniqueWords;
		String sentence;
		
		allWords = words.stream()
					.map(String::toLowerCase)
					.collect(Collectors.toList());
		
		System.out.println(allWords);
		
		uniqueWords = words.stream()
					.map(String::toLowerCase)
					.collect(Collectors.toSet());
		
		System.out.println(uniqueWords);
					
		sentence = words.stream()
				.collect(Collectors.joining(" "));
		
		System.out.println(sentence);
		

	}

}
