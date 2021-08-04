package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		Addition a1=new Addition();
		a1.add();
		a1.add(20, 20);
		a1.add(34.7f, 542.6f);
		a1.add(30, 20, 10);
		a1.add("hello", "world");

	}

}
