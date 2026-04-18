package AbstractClassProblem3;

public class Main {
   public static void main(String args[]) {
	   
	   SavingAccount sb=new SavingAccount();
	   sb.setAccountNumber(272100020);
	   
	   System.out.println("Account number is "+ sb.getAccountNumber() + "  balance is " + sb.getBalance());
	   sb.deposit(200);
	   sb.withdraw(10);
	   sb.showBalance();
	   
	   System.out.println("------------  Another Account -----------");
	   SavingAccount Cr=new SavingAccount();
	   Cr.setAccountNumber(272100010);
	   System.out.println("Account number is "+ sb.getAccountNumber() + "  balance is " + Cr.getBalance());
	   Cr.deposit(200);
	   Cr.withdraw(100500);
	   Cr.showBalance();
   }
}
