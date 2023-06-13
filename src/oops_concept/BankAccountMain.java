package oops_concept;


public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(568652541,1000);
		
		account.deposite(1000);
		
		account.withdraw(600);
		
		double balance=account.getBalance();
		System.out.println("Current balane is "+balance);

	}

}
