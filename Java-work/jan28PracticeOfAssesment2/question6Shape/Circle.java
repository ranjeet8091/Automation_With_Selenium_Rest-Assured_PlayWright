package question6Shape;

public class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double calculateArea() {
      return 3.14*radius*radius;
	}

	public double calculatePerimeter() {
		return 2*3.14*radius;
	}

}
