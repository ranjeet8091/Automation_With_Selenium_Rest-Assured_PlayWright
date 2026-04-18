package question6Shape;

public class Main {
   public static void main(String[] args) {
	   Circle c=new Circle(20);
	   System.out.println("Area of circle is "+ c.calculateArea());
	   System.out.println("Area of circle is "+ c.calculatePerimeter());
	   
	   System.out.println("-----------------------------");
	   
	   Perameter R=new Perameter(20,30);
	   System.out.println("Area of circle is "+ R.calculateArea());
	   System.out.println("Area of circle is "+ R.calculatePerimeter());
   }
}
