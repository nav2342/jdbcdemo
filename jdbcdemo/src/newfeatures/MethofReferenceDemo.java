package newfeatures;
interface hello {
	void welcome();
}
public class MethofReferenceDemo {
	public static void  display()
	{
		System.out.println("Hello from Method Reference");
	}
	public void print()
	{
		System.out.println("instance method call using method reference");
		
	}
	public static void main(String[] args) {
		hello h=MethofReferenceDemo::display;
		h.welcome();
		
		MethofReferenceDemo d1=new MethofReferenceDemo();
		hello h1=d1::print; //invoke instance method
		h1.welcome();
		
		hello h2=MethofReferenceDemo::new; //method reference to constructor
		h2.welcome();

	}

}
