package oops_concept;

public class StudentMain {
	public static void main(String[] args) {
	Student student=new Student();
	student.setStudentName("PK");
	student.setAge(20);
	
	String name=student.getStudentName();
	int age=student.getAge();
	
	System.out.println("Student Name "+name);
	System.out.println("Student age "+age);
}
}
