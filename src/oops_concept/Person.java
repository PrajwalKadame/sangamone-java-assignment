package oops_concept;

public class Person {
	String name;
	String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayDetails() {
		System.out.println("Person Name: "+name);
		System.out.println("Person Address: "+address);
	}
}
