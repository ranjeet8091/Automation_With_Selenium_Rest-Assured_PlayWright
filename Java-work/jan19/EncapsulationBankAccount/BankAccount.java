package EncapsulationBankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accNo,double initialBalance) {
    	this.accountNumber=accNo;
    	this.balance=initialBalance;
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public void deposit(double amount) {
    	if(amount>0) {
    		balance+=amount;
    		System.out.println("Deposite: "+ amount);
    	}
    	else {
    		System.out.println("Invalid deposite Amount");
		}
    }
    
    public void withdraw(double amount) {
    	if(amount<=balance) {
    		balance-=amount;
    		System.out.println("Winthdraw amount :" + amount);
    	}
    	else {
    		System.out.println("Insufficient Amount");
    	}
    }
    
}
