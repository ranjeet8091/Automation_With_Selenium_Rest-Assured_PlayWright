package AbstractClassProblem3;

abstract public class BankAccount {
	private int accountNumber;
	private double balance;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	public void showBalance() {
		System.out.println("    balance of "+ accountNumber +  " is :"+ this.balance);
	}

}
