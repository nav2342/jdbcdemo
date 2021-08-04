package oopsdemo2;

class Staff {
	int empId;
	String name;
	float salary,hra;
	
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void getHRA() {
		hra=(salary*60)/100;
		System.out.println("HRA :"+hra);
	}
	void display() {
		System.out.println("***EmployeeDetails");
		System.out.println(empId+" "+name+" "+salary);
	}
	
}

class Manager extends Staff{
   protected float da;
   private float gross;
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
		
	}
	void getDA() 
	{
		da=(salary*88)/100;
		System.out.println("DA is :"+da);
	}
	void getGross() {
		gross=salary+hra+da;
		System.out.println("Gross Salary of Director is :"+gross);
	}
	
}
class Director extends Manager{
    private float ta,gross;
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
		
	}
	void getTA() {
		ta=(salary*30)/100;
		System.out.println("TA is :"+ta);
	}
	void getGross() {
		gross=salary+hra+da+ta;
		System.out.println("Gross Salary of Director is :"+gross);
	}
}
public class MultiLvel2 {

	public static void main(String[] args) {
		Director d1=new Director(101,"Keane",5000);
		System.out.println("****DirectornDetails****");
        d1.display(); // staff
        d1.getHRA();  // staff
        d1.getDA();   // manager
        d1.getTA();   // director
        d1.getGross();
        Manager m1=new Manager(102,"Ke",3000);
        m1.display(); 
        m1.getHRA();  
        m1.getDA();
        m1.getGross();
        
        Staff s1=new Staff(301,"lee",2500);
        System.out.println("***Staff Details***");
        s1.display();
        s1.getHRA();
	}

}
