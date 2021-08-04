package oopsdemo2;

public class Accountant extends Employee { //child class derived from employee
	String task,tech;
	public Accountant(int empId,String name,String t1,String t2) {
		super(empId,name); //invoke base class constructor
		this.task=t1;
		this.tech=t2;
	}
	void display() {
		super.display(); // invokes base class display() method
		System.out.println("Acc Tak :"+task);
		System.out.println("software used :"+tech);
	}

}
