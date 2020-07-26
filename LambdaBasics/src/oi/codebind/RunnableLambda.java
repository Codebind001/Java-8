package oi.codebind;

public class RunnableLambda {

	public static void main(String[] args) {
		
		Thread obj_Thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
				
			}
		});
		
		obj_Thread.run();
		
		Thread obj_lambda_thread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		obj_lambda_thread.run();
	}

}
