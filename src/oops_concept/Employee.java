package oops_concept;

public class Employee {
	String name;
	int salary;
	String designation;
	public Employee(String name, int salary, String designation) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public void empBonous() {
	double bonous=(salary/12);
	System.out.println("Emp Name is "+name);
	System.out.println("Emp Salary is "+salary);
	System.out.println("Emp Designation is "+designation);
	System.out.println("Emp yearly bonous is "+bonous);
	}

}
