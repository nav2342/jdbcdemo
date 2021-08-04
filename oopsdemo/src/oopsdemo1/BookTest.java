package oopsdemo1;

public class BookTest {
  public static void main(String[] args) {
	  Book b1=new Book();
	  b1.setBookId(101);
	  b1.setBookName("programming");
	  b1.setPrice(200);
	  b1.setPublisher("Prime Books");
	  System.out.println("**book details**");
	  System.out.println(b1.getBookId()+" "+b1.getBookName()+
			  " "+b1.getPrice()+" "+b1.getPublisher());
	  System.out.println(b1); // invoke tostring() method in the instance
  }
}
