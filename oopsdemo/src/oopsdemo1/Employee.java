package oopsdemo1;



public class Employee {
	String name,yoj,address;
	int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYoj() {
		return yoj;
	}
	public void setYoj(String yoj) {
		this.yoj = yoj;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	void input()
	{
		System.out.println("Enter Name, year of joining, salary, address:");
		name=s.next();
		yoj=s.next();
		salary=s.nextInt();
		address=s.next();
		
	}
	void display()
	{
		System.out.println("Name \tYear of joining \taddress");
		System.out.println(name "\t"+yoj "\t"+salary "\t"+address);
		System.out.println("year of joining :"+yoj);
		System.out.println("salary :"+salary);
		System.out.println("address :"+address);
	}
	}



