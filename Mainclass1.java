class Sample1
{
	int x=10;
}

class Demo1 extends Sample1
{
	void disp()
	{
		System.out.println("Hi");
	}
}

class Mainclass1
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.x);
		d1.disp();
	}
}