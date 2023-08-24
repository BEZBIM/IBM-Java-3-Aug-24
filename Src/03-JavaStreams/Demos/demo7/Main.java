package demo7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Item> stock = Arrays.asList(new Item(4.0), new Item(8.3), new Item(8.8));
		
		Double average = stock.stream()
				.collect(Collectors.averagingDouble(Item::getPrice));
		System.out.println(average);
		
		String prices = stock.stream()
				.map(Item::getPrice)
				.map((x) -> String.valueOf(x))
				.collect(Collectors.joining(" "));
				
		System.out.println(prices);
	}

}

class Item {
	private double price;

	public Item(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
