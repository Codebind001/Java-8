package oi.codebind.streams;

import java.util.Arrays;
import java.util.List;

import oi.codebind.example.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Shovan","Mondol",25),
				new Person("Jadab","Chowdury", 25),
				new Person("Lewis","Carrol", 30),
				new Person("Sampa","Das", 25)
				);
		
		people.stream()
		.filter(p -> p.getLast_name().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirst_name()));
		
		/*long count = people.parallelStream()
		.filter(p -> p.getFirst_name().startsWith("S"))
		.count();
		System.out.println(count);
		*/
	}

}
