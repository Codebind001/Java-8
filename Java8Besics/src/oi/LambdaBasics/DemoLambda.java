package oi.LambdaBasics;

public class DemoLambda {

	public static void main(String[] args) {
		
//		print obj;
//		Lambda && Consumer Interface
//		obj = () -> System.out.println("Hello");
//		obj.show();
		
		print hello = () -> System.out.println("Hello ");
		hello.show();

	}

}


interface print{
	void show();
}