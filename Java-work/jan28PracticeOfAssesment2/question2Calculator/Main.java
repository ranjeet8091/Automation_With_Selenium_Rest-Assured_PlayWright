package question2Calculator;

public class Main {
   public static void main(String[] args) {
	   Calculator cal=new Calculator();
	   
	   System.out.println("The Division of this two number is "+ cal.calculateDivision(10, 2));
	   System.out.println("---------------------");
	   
	   System.out.println("The Multiplication of this two number is "+ cal.calculateProduct(10, 2));
	   System.out.println("---------------------");
	   
	   System.out.println("The Substraction of this two number is "+ cal.calculateSubstract(2,3));
	   System.out.println("---------------------");
	   
	   System.out.println("The Addition of this two number is "+ cal.calculateSum(10, 2));
	   System.out.println("---------------------");
   }
}
