package BankingSystem;

public class Test {
      public static void main(String str[]) {
    	  Bank b=new Bank("Ranjeet");
          System.out.println( b.getType());
       
       Bank b1=new Bank("Vibhor",500);
       System.out.println( b1.getType());
      
      }
}
