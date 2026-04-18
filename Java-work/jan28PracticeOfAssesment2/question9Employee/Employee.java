package question9Employee;

public abstract class Employee {
  private String name;
  private String jobTitle;
  private double salary;
  
  
  public String getName() {
	return name;
}

  public void setName(String name) {
	this.name = name;
  }

  public String getJobTitle() {
	return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
  }

  public double getSalary() {
	return salary;
  }

  public void setSalary(double salary) {
	this.salary = salary;
  }

  public void updateSalary(double salary) {
	  this.salary=salary;
	  System.out.println("Your updated Salary is : "+ this.salary);
  }
  
 
  
  public abstract double calculateSalary();
}
