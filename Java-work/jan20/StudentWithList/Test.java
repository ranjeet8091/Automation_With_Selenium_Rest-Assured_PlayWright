package StudentWithList;

class Test{
	public static void main(String[] args) {
		Student st1=new Student();
		st1.setStudentName("Ranjeet");
		st1.setStudentId("Ranjeet123");
		st1.setGrade(80,30,40);
		
		System.out.println(st1.getStudentName());
		System.out.println(st1.calculateAverageGrade());
		
		
		
		Student st2=new Student();
		st2.setStudentName("Vibhor");
		st2.setStudentId("Vibhore123");
		st2.setGrade(20,30,40);

		
		System.out.println(st2.getStudentName());
		System.out.println(st2.calculateAverageGrade());
		
		
	}
}
