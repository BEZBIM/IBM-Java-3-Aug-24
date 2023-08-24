package challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Reference set of Currencies
		Set<String> currencies = new HashSet<>(Arrays.asList("USD", "CDN", "EUR", "JPY"));
        
		// Map of frequencies 
		Map<String, Integer> freq = new HashMap<>();
		freq.put("USD", 0);
		freq.put("CDN", 0);
		freq.put("EUR", 0);
		freq.put("JPY", 0);

        // List of data to be processed
		List<String> data = Arrays.asList(
				"USD", "usd", "gbp", "Aud", "CDN", 
				"JPY", "CDN", "JPY", "eur", "EUR", 
				"cdn","LRA", "USD", "eur", "Aud", 
				"RLA", "USD", "eur");

		// The actual stream pipeline
		data.stream()
		.map(x -> x.toUpperCase())					// Convert everything to upper case
		.map(x -> (x.equals("GBP") ? "EUR" : x))	// Replace "GBP" with "EUR"
		.filter(x -> currencies.contains(x))		// Throw out any bad data	
		.forEach(x -> freq.put(x, freq.get(x) + 1)); // Update the map entry for that element
 
		// Print out the final frequency count.
		System.out.println(freq);
	}
}
