package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		 int a, b, result;  
	     Scanner input = new Scanner(System.in);
	      System.out.println("Input two integers");
	      a = input.nextInt();
	      b = input.nextInt();  
	    try { //statements to be monitored which may throw exception
	      result = a / b;  // b=0-throw arithematic exception
	     System.out.println("Result = " + result);
	    }
	    catch(ArithmeticException e) { //Exception thrown is handled in catch block
	    	System.out.println("If any no. is divided by 0 it throws airthematic exception");
	    	System.out.println("Exception :"+e.getMessage());
	    	System.out.println("Exception name & description :"+e.toString());
	    	e.printStackTrace(); //Details abt exception name,line number which generated exception
	    }
	    finally { //clean up operations
	    	input.close();
	    	System.out.println("final block-program execution ended");
	    }

	}

}
