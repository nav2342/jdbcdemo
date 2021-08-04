package newfeatures;
import static java.lang.System.*;
import static java.util.Collections.*;
import java.util.ArrayList;

import static java.lang.Math.*;
//java 5 - static import
public class StaticImportDemo {

	public static void main(String[] args) {
		out.println("Hello from Static import");
		out.println(10+20);
		
		//instead of Math.sqrt need to use only sqrt
        double var1= sqrt(5.0);
        //instead of Math.tan need to use only tan
        double var2= tan(30);
        //need not to use System in both the below statements
        out.println("Square of 5 is:"+var1);
        out.println("Tan of 30 is:"+var2);
		
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(56);
        a.add(5);
        
        //need not use Collections.sort() etx...as declared above in import static
        sort(a);
        out.println("sorted list: "+a);
        out.print("Max in list :"+max(a));
        out.print("Position of 10 is :"+binarySearch(a,10));

	}

}
