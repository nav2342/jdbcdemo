package oopsdemo2;

public class Vechile {
   void drive() {
	   System.out.println("Driving Vechile");
   }
}
class Car1 extends Vechile{

	@Override
	void drive() {
		System.out.println("Driving Car");
		
	}
	
	
}
class Truck extends Vechile{
	void drive() {
		System.out.println("Driving truck");
	}
	void load() {
		System.out.println("loading truck");
	}
}
