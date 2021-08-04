package assignment;

public class TestToolBoooth {

	public static void main(String[] args) {
		
		        // Create the tollbooth
		AlleghenyTollBooth booth = new AlleghenyTollBooth();
		        // Now for some trucks
		        Truck ford = new Truck(5, 12500);
		        Truck nissan = new Truck(2, 5000);
		        Truck daewoo = new Truck(6, 17000);

		        // Let's start collecting tolls!
		        booth.calculateToll(ford);
		        booth.displayData();
		        booth.calculateToll(nissan);
		        booth.displayData();
		        booth.calculateToll(daewoo);
		        booth.displayData();

		        // Time to collect the receipts
		        booth.onReceiptCollection();

		        // Here comes another truck
		       booth.calculateToll(nissan);
		       booth.displayData();
		    }
		
	}


