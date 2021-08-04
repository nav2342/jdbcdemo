package exceptiondemo;

public class Bankdemo {

	public static void main(String[] args) {
		CheckingAccount c1=new CheckingAccount(101);
		System.out.println("Depositing 5000...");
		c1.deposit(5000);
		
		try
		{
			System.out.println("Withdrawing 1000$");
			c1.withdraw(1000);
			System.out.println("Withdrawing 6000$");
			c1.withdraw(6000);
		}
		catch(InsufficientFunds e) {
			System.out.println("Insufficient bal :"+c1.getBalance());
			e.printStackTrace();
		}

	}

}
