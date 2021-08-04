package newfeatures;

import java.time.LocalDate;

interface MyInterface
{
	public void square(int a); //abstract method
    //default method
	default void display(String a)
	{
		System.out.println("Hello"+a);
	}
	//static methods
	static void printDate()
	{
		System.out.println("Today's date: "+LocalDate.now());
	}
	
}


public class DefaultMethodDemo implements MyInterface {

	public void square(int a) {
		System.out.println("Square of num is :"+(a*a));
		}

	public static void main(String[] args) {
		DefaultMethodDemo d1= new DefaultMethodDemo();
		d1.square(5);
		
		// call default method in interface
		d1.display("Default");
		
		//call Static method in interface
		MyInterface.printDate();
	}

	

}
