package oopsdemo2;

public class SingleInheritenceDemo {

	public static void main(String[] args) {

		Developer d1=new Developer(101,"James","JDBC");
		Developer d2=new Developer(102,"Jam","J2SE");
		Accountant a1=new Accountant(201,"nav","Process salary","Tally");
		Accountant a2=new Accountant(201,"naj","Process salary","SAP");
		d1.display(); //derived class obj invokes parent class method
		d1.display1(); //child class obj invoke child class method
		d2.display();
		d2.display1();
		
		a1.display();
		a2.display();

	}

}
