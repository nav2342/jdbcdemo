package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		
	List<String> city=Arrays.asList("Delhi","Mumbai","Dhanbad","Bengaluru");
	
	city.stream().sorted().forEach(System.out::println); //sorting using streams
	//Operations by creating a stream
	city.stream().filter(s->s.startsWith("D")).map(String::toUpperCase).sorted()
	.forEach(System.out::println);
	
	List<String> bcity=city.stream()
			.filter(s->s.startsWith("D"))
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	
	System.out.println(bcity);
	System.out.println();
	bcity.forEach(c->System.out.println(c)); //printing using lambda expression
	
	//display nos from 1-10 with streams
	IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(i));
	
	System.out.println();
	//sum of array elements using stream
	int[] numbers= {1,2,3,4,5,6,7,8,9,10};
	
	//reduce
	int sum=Arrays.stream(numbers).reduce(0, (a,b)->a+b);
	System.out.println("Sum ");
	
	}

}
