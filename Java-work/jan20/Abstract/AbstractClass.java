package Abstract;

abstract public class AbstractClass {
	public void printName() {
		System.out.println("it will print name");
	}
	
	public void printAddress() {
		System.out.println("It will print address");
	}
	
	abstract void printId();
	abstract void printMarks();

}
