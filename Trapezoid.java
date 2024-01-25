class Trapezoid
{
	void area()
	{
	int a=3;
	int b=2;
	int h=5;
	double result=0.5*(a+b)*h;
	System.out.println(result);
	}

	public static void main(String[] args)
	{
	new Trapezoid().area();
	}
}