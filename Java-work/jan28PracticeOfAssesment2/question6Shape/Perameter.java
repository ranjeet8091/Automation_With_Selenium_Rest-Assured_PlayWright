package question6Shape;

public class Perameter extends Shape {
	int length;
	int breadth;

	public Perameter(int length, int breadth) {
		this.length = length;
		this.breadth= breadth;
	}

	public double calculateArea() {
      return length*breadth;
	}

	public double calculatePerimeter() {
		return 2*length*breadth;
	}

}
