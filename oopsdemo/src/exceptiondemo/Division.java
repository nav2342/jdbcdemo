package exceptiondemo;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
	 int a, b, result;  
     Scanner input = new Scanner(System.in);
      System.out.println("Input two integers");
      a = input.nextInt();
      b = input.nextInt();  
    try {
      result = a / b;  // b=0-throw arithematic exception
     System.out.println("Result = " + result);
    }
    catch(ArithmeticException e) {
    	System.out.println("If any no. is divided by 0 it throws airthematic exception");
    }
    finally {
    	input.close();
    	System.out.println("final block-execution ended");
    }
}
}