package oi.ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		
//		Default or External loop
//		for(int i=0; i<values.size(); i++) {
//			System.out.println(values.get(i));
//		}
		
//		Inhance or External loop
//		for(int i : values) {
//			System.out.println(i);
//		}
		
		//it is a internal loop - Java 8
		values.forEach(i -> System.out.println(i));
		

	}

}
