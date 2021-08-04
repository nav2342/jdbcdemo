package sets;

import java.util.HashSet;
import java.util.Set;

//hashSet with user defined objects
public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		Set<Customer> customers=new HashSet<Customer>();
		customers.add(new Customer(101,"Arjun","bengaluru"));
		customers.add(new Customer(102,"Navi","goa"));
		customers.add(new Customer(103,"Hari","puri"));
		//add duplicate
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

		customers.add(new Customer(101,"Arjun","bengaluru"));
		for(Customer i:customers) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}

	}

}
