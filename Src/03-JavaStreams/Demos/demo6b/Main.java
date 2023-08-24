package demo6b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	// data transformation, create a list of employee names
	
	public static void main(String[] args) {
		
		List<Person> staff = Arrays.asList(
				new Person(787,"Choi"),
				new Person(889,"Anshu"),
				new Person(342,"Eddie"));
		
		// get a list of employee names
		
		List<String> names = staff.stream()
			.map(Person::getName)
			.collect(Collectors.toList());
		
		System.out.println(names);
		
		Map<Integer, String> emps =
				staff.stream()
				.collect(Collectors.toMap(Person::getEmpNum, Person::getName));
		
		System.out.println(emps);
		
		

	}
	

}

class Person {
	private String name;
	private int empNumber;
	
	Person(int empNum, String name) {
	this.name = name;
	this.empNumber = empNum;
	}
	
	public String getName() { return this.name;}
	public int getEmpNum() { return this.empNumber;}
	

}