package oi.codebind;

public class ThisReferenceExample {

	public static void main(String[] args) {
		ThisReferenceExample obj_ThisReferenceExample = new ThisReferenceExample();
		obj_ThisReferenceExample.execute();
		

	}
	
	public void doProcess(int i, Process p) {
		p.process(i);
		
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is "+i);
			System.out.println(this);
		});
	}
	
	public String toString() {
		return "This is the main class instance";
	}

}
