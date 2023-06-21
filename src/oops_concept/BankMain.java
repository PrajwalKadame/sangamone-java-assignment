package oops_concept;

import java.util.ArrayList;
import java.util.List;

class Account {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successfully made to account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successfully made from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(String accountNumber, String accountHolder, double initialBalance) {
        Account account = new Account(accountNumber, accountHolder, initialBalance);
        accounts.add(account);
        System.out.println("Account " + accountNumber + " opened for " + accountHolder);
    }

    public void closeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account " + accountNumber + " closed.");
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = null;
        Account toAccount = null;

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(fromAccountNumber)) {
                fromAccount = account;
            } else if (account.getAccountNumber().equals(toAccountNumber)) {
                toAccount = account;
            }

            if (fromAccount != null && toAccount != null) {
                break;
            }
        }

        if (fromAccount == null) {
            System.out.println("From account " + fromAccountNumber + " not found.");
        } else if (toAccount == null) {
            System.out.println("To account " + toAccountNumber + " not found.");
        } else {
            if (fromAccount.getBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transfer of " + amount + " from account " + fromAccountNumber + " to account " + toAccountNumber + " completed.");
            } else {
                System.out.println("Insufficient funds in account " + fromAccountNumber + " for transfer.");
            }
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.openAccount("A1215", "Prajwal", 1000.0);
        bank.openAccount("A1216", "Prateek", 2000.0);

        bank.transferFunds("A1215", "A1216", 500.0);

        bank.closeAccount("A1215");
    }
}
