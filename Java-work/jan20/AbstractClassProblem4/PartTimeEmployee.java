package AbstractClassProblem4;

public class PartTimeEmployee  extends Employee{
	 int hourRate;
	 int hourWork;
	 
	public PartTimeEmployee(int hourRate, int hourWork) {
		this.hourRate = hourRate;
		this.hourWork = hourWork;
	}

	public double calculateSalary() {
		return getBaseSalary()+(hourWork * hourRate);
	}

}
