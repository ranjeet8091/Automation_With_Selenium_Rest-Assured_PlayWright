package question9Employee;

public class Manager extends Employee{
	private double bonus;
	
	 public  double calculateSalary() {
		 return getSalary()+bonus;
	 }
	 public String  toString() {
		 return "Employee name: "+getName()+" Salary of employee: " + calculateSalary();
	  }

}
