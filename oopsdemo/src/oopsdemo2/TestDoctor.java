package oopsdemo2;
// Hierarical inheritence
public class TestDoctor {
	int idNumber;
	String name;
	String address;
	

	public TestDoctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	void display() {
	    System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The number is :" + idNumber);
	        System.out.println("The address is :" + address);
	    }
}
class Specialist extends TestDoctor {
	String speciality;
	public Specialist(int idNumber, String name, String address, String sp ) {
		super(idNumber, name, address); // invokes base class constructor
		this.speciality=sp;
	}
	void display() {
		super.display();
		System.out.println("The speciality is:" +speciality);
	}
}
class NonSpecialist extends TestDoctor{
public NonSpecialist (int idNumber, String name, String address) {
	super(idNumber, name, address);
}
}


	
     

	
	
	    


