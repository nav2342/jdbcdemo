package oopsdemo2;

public class ConstructorOverloading {
	 
	{
	    String name;
	    int rollNo;
	    String className;
	    boolean isFromCity;
	    
	    ConstructorOverloading(String name, int rollNo)
	    {
	        this.name = name;
	        this. rollNo = rollNo;
	    }
	    
	    ConstructorOverloading(String name, int rollNo, String className, boolean isFromCity)
	    {
	        this.name = name;
	        this. rollNo = rollNo;
	        this.className = className;
	        this.isFromCity = isFromCity;        
	    }
	    
	    public void studentData()
	    {
	        System.out.println("Name of Student = " + name);
	        System.out.println("Roll no = "+ rollNo);
	        System.out.println("Class Name = "+ className);
	        System.out.println("Is student belongs to city = "+ isFromCity);
	    }
	    
	    public static void main (String arg[])
	    {
	       // Creating object and providing some values by using parameterized constructor
	        
	    	ConstructorOverloading c1 = new ConstructorOverloading("Ravi", 1);
	        c1.studentData();
	        
	        ConstructorOverloading c2 = new ConstructorOverloading("Ram", 2, "MCA", true);
	        c2.studentData();
	        
	        
	}
}
