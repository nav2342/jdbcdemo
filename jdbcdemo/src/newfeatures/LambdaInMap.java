package newfeatures;
import java.util.HashMap;
import java.util.Map;
// using lambda expressions in map
public class LambdaInMap {

	public static void main(String[] args) {
		
		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        //iterating using lambda expression
        books.forEach((key,value)->System.out.println("Book Name :"+key +" -Author :"+value));
	}

}
