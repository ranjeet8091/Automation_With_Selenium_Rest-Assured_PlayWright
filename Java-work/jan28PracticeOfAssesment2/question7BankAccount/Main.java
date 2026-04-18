package question7BankAccount;

public class Main {
  public static void main(String[] args) {
	  SavingAccount sB=new SavingAccount(10000,"Ranjeet Tiwari");
	  sB.checkBalance();
	  
	  sB.deposit(2000);
	  sB.checkBalance();
	  sB.withdraw(1000);
	  sB.checkBalance();
  }
}
