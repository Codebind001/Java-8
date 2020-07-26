package oi.codebind.function_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import oi.codebind.example.Person;

public class StandratFunctionalExample {

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
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		
		//Task 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all persons with last name beginning with C");
		performConditionally(people, p -> p.getLast_name().startsWith("C"), p -> System.out.println(p));
		
		
		System.out.println("\nPrinting all persons with First name beginning with S");		
		performConditionally(people, p ->  p.getFirst_name().startsWith("S"), p -> System.out.println(p.getFirst_name()));
		
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}
}
