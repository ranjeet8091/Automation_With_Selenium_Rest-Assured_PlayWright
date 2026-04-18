package StudentWithList;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String studentId;
    String StudentName;
    double AverageGrade;
	List<Integer> grades=new ArrayList<>();
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	public void setGrade(int... newGrades) {
		for(int x:newGrades) {
			if(x<0 && x>100) {
				System.out.println("Invalid output");
			}
			else {
				grades.add(x);
			}
				
		}
	}
	public List<Integer> getGrades() {
		return grades;
	}
	
	public double calculateAverageGrade() {
		
		for(int grade:grades) {
			AverageGrade+=grade;
		}
		AverageGrade=AverageGrade/grades.size();
		
		return AverageGrade;
	}


}

