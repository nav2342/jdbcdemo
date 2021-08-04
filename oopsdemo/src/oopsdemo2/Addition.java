package oopsdemo2;

public class Addition {
void add() {
	System.out.println("Method Overloading");
}
void add(int a,int b) {
	System.out.println("Addition of 2 Nos :"+(a+b));
}
void add(float a,float b) {
	System.out.println("Addition of 2 float nos is :"+(a+b));
}
void add(int a,int b,int c) {
	System.out.println("Addition 0f 3 nos :"+(a+b+c));
}
void add(String s1,String s2) {
	System.out.println("Addition of 2 Strings is :"+(s1+s2));
}
}
