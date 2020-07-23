package oi.DefineInterface;

public class StaticMethod {

	public static void main(String[] args) {
		
		//subject obj_Subject = new book();
		//obj_Subject.SubjectDescribtion();
		subject.SubjectName();

	}

}


interface subject{
	
	void SubjectDescribtion();
	
	static void SubjectName(){
		System.out.println("Java");
	}
}


class book implements subject{

	@Override
	public void SubjectDescribtion() {
		
		System.out.println("Introduction to Java");
		
	}
	
}
