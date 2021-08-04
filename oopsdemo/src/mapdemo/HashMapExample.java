package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		hm.put("john", 760.0);
		hm.put("jim", 860.0);
		hm.put("jack", 476.0);
		hm.put("mike", 490.0);
		hm.put("daisy", 1000.0);
		 System.out.println("Display Customers & balance ");
		    for(String k:hm.keySet()) {
		    	System.out.println(k+"-->"+hm.get(k));
		    }
		    //deposit 1000 to jim's Account
		    double bal=hm.get("jim");
		    hm.put("jim",bal+1000);
		    
		    System.out.println("Jims's new bal :"+hm.get("jim"));
	
	 hm.putIfAbsent("Raj", 500.00);
	 System.out.println(hm);
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter customer name for it's bal");
	 String name=s.next();
	 System.out.println("the bal of"+name+" :"+hm.get(name));
	}

}
