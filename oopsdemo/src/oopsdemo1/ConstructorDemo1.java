package oopsdemo1;

public class ConstructorDemo1 {
	int id;
	String name;
	float salary;
	
	ConstructorDemo1() // Implicit Constructor
	{
		System.out.println("I am Default Constructor");
		id=0;
		name="";
		salary=5000.00f;
	}
	
	void display() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		ConstructorDemo1 cd1=new ConstructorDemo1(); // invoke implicit constructor
		ConstructorDemo1 cd2=new ConstructorDemo1();
		cd1.display();
	}

}
