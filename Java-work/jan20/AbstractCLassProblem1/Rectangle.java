package AbstractCLassProblem1;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double area() {
		return length* breadth;
	}
}
