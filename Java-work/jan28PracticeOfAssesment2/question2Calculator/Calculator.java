package question2Calculator;

public class Calculator {
	
     public int calculateSum(int num1,int num2) {
    	  return num1+num2;
     }
     
     public int calculateProduct(int num1,int num2) {
    	 return num1*num2;
     }
     
     public int calculateSubstract(int num1,int num2) {
    	   int result=num1-num2;
    	   if(result<0) {
    		   System.out.println("Result is negative");
    		   return result;
    	   }else {
    		   return result;
    	   }
     }
     
     public double calculateDivision(int num1,int num2) {
    	 return num1/num2;
     }
}
