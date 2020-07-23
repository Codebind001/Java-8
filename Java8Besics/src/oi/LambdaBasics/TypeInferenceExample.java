package oi.LambdaBasics;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLength hello = s -> s.length();
		System.out.println("your string length is "+hello.getLength("Hello"));
		
		
		addNumber Addition = (i,j) -> i+j;
		System.out.println(Addition.sum(5, 8));
 
	}

}

interface StringLength{
	int getLength(String s);
}


interface addNumber{
	int sum(int a, int b);
}