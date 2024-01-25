class Sector
{
	void area()
	{
	final double pi=3.142;
	int r=3;
	double t=30.5;
	double result=0.5*r*r*t;
	System.out.println(result);
	}

	public static void main(String[] args)
	{
	new Sector().area();
	}
}