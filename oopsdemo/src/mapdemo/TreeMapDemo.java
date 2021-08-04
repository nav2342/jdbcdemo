package mapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> fileExtensions=new TreeMap<String,String>();
		//Adding new key-value pairs to a tree map
		fileExtensions.put("python", "py");
		fileExtensions.put("java", "ja");	
				
			
		//tree map will be sorted based on keys
		System.out.println(fileExtensions);
		TreeMap<String,String> fileExtensions1=new TreeMap<String,String>(Comparator.reverseOrder());
		fileExtensions1.put("python", "py");
		fileExtensions1.put("java", "ja");	
		System.out.println(fileExtensions1);
	}

}
