package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Developer> a1=new ArrayList<Developer>();
		Developer d1=new Developer(103,"Mike","Java");
		Developer d2=new Developer(105,"Mie","dot net");
		Developer d3=new Developer(103,"kim","Angular");
		Developer d4=new Developer(104,"Marry","php");
		a1.add(d1);a1.add(d2);a1.add(d3);a1.add(d4);
		System.out.println("-----unsorted-----");
		for(Developer i:a1) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
			Collections.sort(a1,new IdComparator());
			
			//Sort by id
			System.out.println("-----Sort by id-----");
			for(Developer i:a1) {
				System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
			}
			//sort bu domain
			Collections.sort(a1,new DomainComparator());
			System.out.println("-----Sort by domain-----");
			for(Developer i:a1) {
				System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
			}
		}
	}


