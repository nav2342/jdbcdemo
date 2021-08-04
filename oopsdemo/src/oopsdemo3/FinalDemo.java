package oopsdemo3;
final class Hello{
	 final void display() {
		System.out.println("This is final method");
	}
}
 //class World extends Hello { //final classes cannot be extended
	/* final void display() {
	/*	System.out.println("");
	} */
//}
public class FinalDemo {

	public static void main(String[] args) {
		final int AGE=20;
		final float PI=3.142f;
	//	AGE=30; compilation error final variable cannot be changed

	}

}
