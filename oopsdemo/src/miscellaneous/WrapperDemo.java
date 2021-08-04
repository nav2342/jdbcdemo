package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {
		// create primitive types
		int a=5;
		float b=10.10f;
		//convert into wrapper objects
	//	Integer aObj=new Integer(a);
	//	Double bObj=new Double(b);
		
		Integer aObj=(a); //Auto boxing -convert value to object
		Float bObj=(b);
		//create wrapper class object
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(100.00);
		
		//convert into primitive types
		int p=x.intValue(); //Auto unboxing -convert object to value
		double q=y.doubleValue();
		
		System.out.println(p+" "+q);
		System.out.println(aObj+" "+bObj);
		
		char e='a';
		Character objE=e; // boxing
		System.out.println(objE);
		System.out.println(Character.isUpperCase(e));
		Double d=200.55;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		String hex="0xff";
		String oct="005";
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
	}

}
