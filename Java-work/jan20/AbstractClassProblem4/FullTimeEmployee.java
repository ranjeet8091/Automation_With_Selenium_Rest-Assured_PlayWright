package AbstractClassProblem4;

public class FullTimeEmployee extends Employee {
	private int bonous;
	
	
	public FullTimeEmployee(int bonous) {
		this.bonous = bonous;
	}


	double calculateSalary() {
		return getBaseSalary()+bonous;
	}

}
