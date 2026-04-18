package AbstractClassProblem4;

abstract public class Employee {
	private String name;
	private double baseSalary=1000;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	abstract double calculateSalary();

}
