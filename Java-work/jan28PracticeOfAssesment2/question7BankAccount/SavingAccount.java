package question7BankAccount;

public class SavingAccount implements AccountOperations {
   double balance; 
   String name;
   public SavingAccount(double balance,String name) {
	   this.balance=balance;
	   this.name=name;
   }
   public void withdraw(double amount) {
	   if(amount>balance) {
		   System.out.println("Insuffiecient Balance");
	   }
	   else {
		   balance=balance-amount;
		   System.out.println("Your updated Balance: "+balance);
	   }
   }
   
   public void deposit(double amount) {
	   if(amount<0) {
		   System.out.println("Not Valid deposit amount");
	   }
	   else {
		   balance=balance+amount;
		   System.out.println("Your updated Balance: "+balance);
	   }
   }
   
   public void checkBalance() {
	   System.out.println("Your balance is : "+balance);
   }
   
}
