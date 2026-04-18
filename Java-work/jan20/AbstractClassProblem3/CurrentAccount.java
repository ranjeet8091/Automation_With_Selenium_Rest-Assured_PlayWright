package AbstractClassProblem3;

public class CurrentAccount extends BankAccount {
   
	public void withdraw(double amount) {
			
			double newBalance=getBalance()-amount;
			setBalance(newBalance);
			System.out.println("Your amount Withdraw "+ amount + " and your balance "+getBalance());
	}
	public void deposit(double amount) {
		setBalance(amount+getBalance());
		System.out.println("Your amount deposited "+ amount + " and your balance "+getBalance());
	}
}
