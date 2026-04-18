package string1;

public class Main {
   public static void main(String args[]) {
	   String s="Java";
	   System.out.println("Original String: " + s) ;
	   
//	   Trying to modify
	   s.concat("Programming ");
	   
//	   Still the same, Because String are immutable
	   System.out.println("After concate Attempt: " + s);
	   
//	   proper way
	   s=s.concat("Programming");
	   System.out.println("After Concat : "+ s);
	   
	   s=s+"Ranjeet";

	   
//	   concate return new object
	   
   }
}
