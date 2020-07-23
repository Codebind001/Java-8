package oi.ForEachLoop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class BehindForEach {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		//Consumer<Integer> c = new ConsImpl();
		// if we write below line, then we didn't new implement of Consumer
		Consumer<Integer> c = i -> System.out.println(i); 
		values.forEach(c);
	}

}


//class ConsImpl implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer i) {
//		System.out.println(i);
//		
//	}
//	
//}
