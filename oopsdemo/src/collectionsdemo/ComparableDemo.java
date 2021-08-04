package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student(101,"Mike",19);
		Student s2=new Student(102,"Mike",13);
		Student s3=new Student(103,"Mike",10);
		Student s4=new Student(104,"Mike",17);
		//adding student list
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);
		Collections.sort(a1); //invoke compareTo() method of student java
		System.out.println("**Student sorted list based on age**");
		for(Student s:a1) {
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}
	}

}
