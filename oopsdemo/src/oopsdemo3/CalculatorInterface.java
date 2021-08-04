package oopsdemo3;

import java.util.Scanner;

public class CalculatorInterface implements IMath {
	Scanner kb;
	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Sub of "+a+" and "+b+" is "+s);

	}

	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("div of "+a+" and "+b+" is "+s);

	}
	void display() {
		System.out.println("Designed by nav");
	}

	public static void main(String[] args) {
		CalculatorInterface c1=new CalculatorInterface();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		c1.display();
	}

}
