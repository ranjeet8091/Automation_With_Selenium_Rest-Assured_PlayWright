package question5OverLoading;

public class AreaCalculator {
	
	void calculateArea(double radius){
		System.out.println("Area of circle: "+ 3.14*radius*radius);
	}
	void calculateArea(double length, double width){
		System.out.println("Area of Rectangle: "+ length*width);
	}
}
