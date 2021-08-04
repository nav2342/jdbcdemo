package oopsdemo2;
// Dynamic Polymorphism
public class TestVechile {

	public static void main(String[] args) {
		Vechile vObj=new Vechile();
		vObj.drive();
		
		Vechile vCar=new Car1(); //upcasting
		vCar.drive(); //invoke overriden drive method of car1 class
		
		Vechile vTruck=new Truck();
		vTruck.drive();
	//  vTruck.load(); //compiler error
		
		Truck t1=new Truck();
		t1.load();
		

	}

}
