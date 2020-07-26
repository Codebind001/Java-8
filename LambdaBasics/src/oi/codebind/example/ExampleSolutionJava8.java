package oi.codebind.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ExampleSolutionJava8 {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Shovan","Mondol",25),
				new Person("Jadab","Chowdury", 25),
				new Person("Lewis","Carrol", 30),
				new Person("Sampa","Das", 25)
				);

		//Task 1: Sort list by last name
		Collections.sort(people, (p1,p2) -> p1.getLast_name().compareTo(p2.getLast_name()));
		
		//Task 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons ");
		printConditionally(people, p -> true);
		
		
		//Task 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all persons with last name beginning with C");
		printConditionally(people, p -> p.getLast_name().startsWith("C"));
		
		
		System.out.println("\nPrinting all persons with First name beginning with S");		
		printConditionally(people, p ->  p.getFirst_name().startsWith("S"));
		
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p: people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
		
	}

}
