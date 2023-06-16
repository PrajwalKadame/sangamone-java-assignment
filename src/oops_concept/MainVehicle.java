package oops_concept;

public class MainVehicle {
	public static void main(String[] args) {
		Car3 c1=new Car3();
		MoterCycle m1=new MoterCycle();
		Truck t1=new Truck();
		Engine e1=new Engine();
		e1.onOff(c1);
		e1.onOff(m1);
		e1.onOff(t1);
	}
}

class Vehicle{
	void start() {
		System.out.println("Start the vehicle");
	}
	void stop() {
		System.out.println("Stop the vehicle");
	}
}

class Car3 extends Vehicle{
	void start() {
		System.out.println("Start the Car");
	}
	void stop() {
		System.out.println("Stop the Car");
	}
}

class MoterCycle extends Vehicle{
	void start() {
		System.out.println("Start the MoterCycle");
	}
	void stop() {
		System.out.println("Stop the MoterCycle");
	}
}

class Truck extends Vehicle{
	void start() {
		System.out.println("Start the Truck");
	}
	void stop() {
		System.out.println("Stop the Truck");
	}
}

class Engine{
	void onOff(Vehicle v1) {
	v1.start();
	v1.stop();
	}
}
