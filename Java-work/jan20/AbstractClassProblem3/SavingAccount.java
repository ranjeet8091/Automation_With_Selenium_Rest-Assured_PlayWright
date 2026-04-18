package AbstractClassProblem3;

public class SavingAccount extends BankAccount{
	public void withdraw(double amount) {
		if(amount >10000) {
			System.out.println("----------------Exception--------------");
			System.out.println("Your withdrawal amount is exceed");
		}
		else {
			
			double newBalance=getBalance()-amount;
			setBalance(newBalance);
			System.out.println("Your amount Withdraw "+ amount + " and your balance "+getBalance());
		}
	}
	public void deposit(double amount) {
		setBalance(amount+getBalance());
		System.out.println("Your amount deposited "+ amount + " and your balance "+getBalance());
	}
	 
}
