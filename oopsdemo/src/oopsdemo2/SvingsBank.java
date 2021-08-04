package oopsdemo2;

public class SvingsBank extends Account { //child class of account
	private int min_bal; //within class
	protected int balance; // within class and subclass

	
	public SvingsBank(int accNo, String name, int mb, int b) {
		super(accNo, name); // invokes Account
		this.min_bal = mb;
		this.balance = b;
	}
	void display()
    {
            super.display();
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
	

}
