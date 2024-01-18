class Sample2
{
	int x=10;
}

class Demo2 extends Sample2
{
	void disp()
	{
		System.out.println("Hi");
	}
}

class Tester2 extends Demo2
{
	int y=20;
}

class Mainclass2
{
	public static void main(String[] args)
	{
		Tester2 t1=new Tester2();
		System.out.println(t1.x);
		t1.disp();
		System.out.println(t1.y);
	}
}