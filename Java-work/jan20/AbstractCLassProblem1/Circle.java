package AbstractCLassProblem1;

public class Circle extends Shape {
	int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public double area() {
		double Area=3.14*radius*radius;
		return Area;
		
	}
}
