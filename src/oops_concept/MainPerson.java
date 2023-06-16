package oops_concept;

public class MainPerson {
	public static void main(String[] args) {
	Child child=new Child("Pk",6);
	Adult adult=new Adult("Kp",26);
	
	child.play();
	adult.play();
}
}

interface Playable{

	void play();
}

class Person2{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	
	
}

class Child extends Person2 implements Playable {
    public Child(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println(getName() + " is playing with toys.");
    }
}

class Adult extends Person2 implements Playable{
	public Adult(String name, int age) {
		super(name,age);
	}

	public void play() {
		System.out.println(getName()+" is playing a spot.");		
	}
}