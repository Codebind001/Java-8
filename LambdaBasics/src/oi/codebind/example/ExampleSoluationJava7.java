package oi.codebind.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleSoluationJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Shovan","Mondol",25),
				new Person("Jadab","Chowdury", 25),
				new Person("Lewis","Carrol", 30),
				new Person("Sampa","Das", 25)
				);

		//Task 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLast_name().compareTo(o2.getLast_name());
			}
		});
		
		//Task 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons ");
		printAll(people);
		
		
		//Task 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all persons with last name beginning with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLast_name().startsWith("C");
			}

			
		});
		
		System.out.println("\nPrinting all persons with First name beginning with S");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirst_name().startsWith("S");
			}

			
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
		
	}

}
interface Condition{
	boolean test(Person p);
}
