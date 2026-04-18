package EncapsulationBankAccount;

public class BankImpl {
   public static void main(String arg[]) {
	   
    BankAccount acc1=new BankAccount("RANJ09",5000);
    
    System.out.println("Initaial Balance "+acc1.getBalance());
    acc1.deposit(2000);
    acc1.withdraw(5000);
    System.out.println("Final Balance: "+acc1.getBalance());
   }
}
