package oi.DefineInterface;

public class DefineMethods {

	public static void main(String[] args) {
		
		phone obj_Phone = new AndroidPhone();
		obj_Phone.call();
		obj_Phone.message();

	}

}

interface phone{
	void call();
	
	default void message() {
		System.out.println("Text Sent");
	}
}


class AndroidPhone implements phone{

	@Override
	public void call() {
		System.out.println("Calling");
		
	}
	
}