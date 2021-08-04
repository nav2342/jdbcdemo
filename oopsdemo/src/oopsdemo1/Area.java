package oopsdemo1;

import java.util.Scanner;

public class Area {
	


		//int length,breadth;
	    //Area(int l, int b){
		  //      length = l;
		  //      breadth = b;
		
	//	}
		public int returnArea(int l,int b){
		int results = l * b;
		return results;
		}
		// public void getArea(){
		//System.out.println("Area = " +  returnArea());
		//}
		public static void main(String []args){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter length");
			int l=sc.nextInt();
			System.out.println("Enter breadth");
			int b=sc.nextInt();
			
		Area x =new Area();
		int a=x.returnArea(l, b);
		System.out.println("Area="+a);
		//x.getArea();
		    
		}
}


