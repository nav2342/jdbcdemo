package oopsdemo2;
//Multilevel Inheritence

public class Account { // base class for savings account
	int accNo;
	String name;
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	void display() {
		System.out.println("***Acc Dtails***");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}

}
