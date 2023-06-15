package oops_concept;

public class Book {
	String title;
	String author;
	double price;
	double actualprice;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void bookDiscount() {
		double discount=0.1;
		actualprice=price-(price*discount);
		
	}
	
	public void displayDetails() {
		System.out.println("Book tile: "+title);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
		System.out.println("Book discount: 10%");
		System.out.println("Book price with discount: "+actualprice);
	}
	
}
