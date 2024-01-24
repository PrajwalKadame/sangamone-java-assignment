interface Sample1
{
	void disp();
	void test();
}

class Demo implements Sample1
{
	public void disp()
	{
		System.out.println("Hi");
	}
	public void test()
	{
		System.out.println("Hello");
	}
}

class Mainclass
{
	public static void main(String[] args)
	{
		Demo d1=new Demo();
			d1.disp();
			d1.test();
	}
}
