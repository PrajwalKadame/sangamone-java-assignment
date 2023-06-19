package oops_concept;

public class EmployeeMain1 {
	public static void main(String[] args) {
	Manager mgr=new Manager("PK",1050000);
	System.out.println("Manager Tax: "+mgr.calculateTax());
	
	Engineer eng=new Engineer("KP",560000);
	System.out.println("Engineer:"+eng.calculateTax());
	}
}

interface Taxable{
	double calculateTax();
}

class Employee11{
	String name;
	double salry;
	public Employee11(String name, double salary) {
		this.name = name;
		this.salry = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalry() {
		return salry;
	}	
}

class Manager extends Employee11 implements Taxable{
	public Manager(String name, int salary) {
	super(name, salary);
	}

	public double calculateTax() {
		double tax=0.2;
		return getSalry()*tax;
	}
}

class Engineer extends Employee11 implements Taxable{
	public Engineer(String name, double salary) {
		super(name, salary);
	}
		public double calculateTax() {
			double tax=0.2;
			return getSalry()*tax;
		}
	}