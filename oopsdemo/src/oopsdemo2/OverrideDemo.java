package oopsdemo2;

class Bank {
	int getRateofInterest() {
		return 0;
	}
	void display() {
		System.out.println("welcome to bank");
	}
}
class SBI extends Bank {
	int getRateofInterest() { // overridden method
		return 5;
	}
}
class ICICI extends Bank {
	int getRateofInterest() { // overridden method
		return 7;
	}
}
class AXIS extends Bank {
	int getRateofInterest() { // overridden method
		return 6;
	}
}


public class OverrideDemo {

	public static void main(String[] args) {
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		AXIS b3=new AXIS();
		b1.display();
		System.out.println("SBI INTEREST RATE IS :"+b1.getRateofInterest());
		b2.display();
		System.out.println("ICICI INTEREST RATE IS :"+b2.getRateofInterest());
		b3.display();
		System.out.println("AXIS INTEREST RATE IS :"+b3.getRateofInterest());
	}

}
