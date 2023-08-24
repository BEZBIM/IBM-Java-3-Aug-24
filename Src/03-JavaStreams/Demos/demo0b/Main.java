package demo0b;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		 List<Person> friends = Arrays.asList(
				 new Person("Gandalf"),
				 new Person("Frodo"),
				 new Person("Pippen"));
		 
		 friends.forEach(Person::print);

	}
}

	class Person {
		private String name;

		public Person(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
		public void print() {
			System.out.println(this.getName());
		}
		
		
	}