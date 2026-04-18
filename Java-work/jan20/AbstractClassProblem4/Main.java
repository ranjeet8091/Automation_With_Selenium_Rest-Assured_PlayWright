package AbstractClassProblem4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Employee> Employees=new ArrayList<>();
		Employee e1 =new FullTimeEmployee(5000);
		Employee e2=new PartTimeEmployee(5,100);
		Employees.add(e1);
		Employees.add(e2);
		
		for(Employee emp:Employees) {
			System.out.println("Salary: "+ emp.calculateSalary());
		}
		
	}

}
