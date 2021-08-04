package oopsdemo1;

import java.util.Scanner;

// Program to demonstrate working of constructors
class Person {
	String name,constituency;
	int age;
	Scanner s;
	public Person() { // implicit constructor
		System.out.println("Voter Eligibility App");
		age=0;
		name="";
		constituency="Bengaluru";
		s=new Scanner(System.in);
		}
	public Person(String name, int age) { // parameterized constructor
		this.name = name;
		this.age = age;
		constituency="Mumbai";
	}
	Person(String n, int a, String c) // parameterized constructor 3 args
	{
		name=n;
		age=a;
		constituency=c;
	}
	 void input() {
		 System.out.println("Enter ur name");
		 name=s.nextLine();
		 System.out.println("enter ur age");
		 age=s.nextInt();
	 }
	 void print() {
		 System.out.println("Name is :"+name);
		 System.out.println("Age is :"+age);
		 System.out.println("Constituency is :"+constituency);
	 }
	 
	
	}
	
	


public class PersonTest {

	public static void main(String[] args) {
	Person objPerson1=new Person(); // invoke implicit constructor
	objPerson1.input();
	objPerson1.print();
	System.out.println("---------------------------------");
	Person objPerson2=new Person("Mike",45); // invoke constructor with 2 args
	objPerson2.print();
	System.out.println("---------------------------------");
	Person objPerson3=new Person("Ravi",35,"Delhi"); // invoke constructor with 2 args
	objPerson3.print();


	}

}
