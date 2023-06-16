package oops_concept;

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
	
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}
	
class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating");
	}
	
	void sleep() {
		System.out.println("Cat is sleeping");
	}
}

class Bird extends Animal{
	void eat() {
		System.out.println("Bird is is eating");
	}
	
	void sleep() {
		System.out.println("Bird is sleeping");
	}
}

class Simulator{
	static void ansim(Animal a1) {
		a1.eat();
		a1.sleep();
		
	}
}

public class MainAnimal{
public static void main(String[] args) {
	Dog d1=new Dog();
	Cat c1=new Cat();
	Bird b1=new Bird();
	Simulator.ansim(d1);
	Simulator.ansim(c1);
	Simulator.ansim(b1);
	
}
}

