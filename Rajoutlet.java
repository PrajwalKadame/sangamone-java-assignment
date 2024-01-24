interface Nike
{
	void shoes();
}

interface Puma extends Nike
{
	public void bags();	
}

class Rajoutlet implements Puma
{
	public void shoes()
	{
		System.out.println("Rebok sheos");
	}

	public void bags()
	{
		System.out.println("American Tourist bags");
	}


	public static void main(String[] args)
	{
		Rajoutlet r1=new Rajoutlet();
			r1.shoes();
			r1.bags();
	}
}
