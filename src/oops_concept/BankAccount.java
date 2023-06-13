package oops_concept;

public class BankAccount {
 int accountNumber;
 double balance;
 
 BankAccount(int accountNumber, double balance){
	 this.accountNumber=accountNumber;
	 this.balance=balance;
 }
 
 public void deposite(double amount) {
	 if(amount>0) {
		 balance=balance+amount;
		 System.out.println("Deposited "+amount+" into Account number "+accountNumber+".");
		}else {
			System.out.println("Invalid amount. Please enter a positive value.");
		}
 }
 public void withdraw(double amount) {
     if (amount > 0) {
         if (balance >= amount) {
             balance=balance-amount;
             System.out.println("Withdrew " + amount + " from account " + accountNumber + ".");
         } else {
             System.out.println("Insufficient funds.");
         }
     } else {
         System.out.println("Invalid amount. Please enter a positive value.");
     }
 
 }
 
 public double getBalance() {
	 return balance;
 }
}

