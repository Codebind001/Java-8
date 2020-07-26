package oi.codebind.method_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import oi.codebind.example.Person;

public class MethodReferenceExample2 {

public static void main(String[] args) {	
		
		List<Person> people = Arrays.asList(
				new Person("Shovan","Mondol",25),
				new Person("Jadab","Chowdury", 25),
				new Person("Lewis","Carrol", 30),
				new Person("Sampa","Das", 25)
				);

		System.out.println("Printing all persons ");
		performConditionally(people, p -> true, System.out::println); //replace p-> method(p)
				
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}
