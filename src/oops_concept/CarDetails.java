package oops_concept;

public class CarDetails {
	String make;
	String model;
	int year;
	public CarDetails(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails() {
		System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	}
	
	
	
}
