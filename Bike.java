class Bike
{
	String b_brand;
	int b_cost;
    String b_color;
		
			Bike(String a, int b, String c)
			{
				b_brand=a;
				b_cost=b;
				b_color=c;
			}

	public static void main(String[] args)
	{
		Bike b1=new Bike("TVS",112000,"Blue");
		System.out.println("The Bike brand is "+b1.b_brand);
		System.out.println("The Bike cost is "+b1.b_cost);
		System.out.println("The Bike color is "+b1.b_color);

		Bike b2=new Bike("Hero",152000,"Yellow");
		System.out.println("The Bike brand is "+b2.b_brand);
		System.out.println("The Bike cost is "+b2.b_cost);
		System.out.println("The Bike color is "+b2.b_color);
	}

	
}