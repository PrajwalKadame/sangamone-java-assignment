class Car
{
	String c_model;
	int c_cost;
	String c_type;
		
			Car(String a, int b, String c)
			{
				c_model=a;
				c_cost=b;
				c_type=c;
			}


	public static void main(String[] args)
	{
		Car c1=new Car("ZEN",450000,"Petrol");
		System.out.println("The car model is "+c1.c_model);
		System.out.println("The car cost is "+c1.c_cost);
		System.out.println("The car type is "+c1.c_type);
	}

	
}