package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(10,55,4); // invoke constructor
		Time t2=new Time(2,25,55);
		t1.add(t2); // calls method ad() by passing object c2
		System.out.println("The addition of 2 time number is:");
		t1.display();

	}

}
