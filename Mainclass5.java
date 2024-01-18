class Sample5
{
	int x=10;
}

class Demo5 extends Sample5
{
	void disp()
	{
		System.out.println("Hi");
	}
}

class Tester5 extends Demo5
{
	int y=20;
}

class Cool5 extends Sample5
{
	void fo()
	{
		System.out.println("Heyy i am fo");
	}
}

class Mainclass5
{
	public static void main(String[] args)
	{
		Tester5 t1=new Tester5();
		System.out.println(t1.x);
		t1.disp();
		System.out.println(t1.y);

		Cool5 c1=new Cool5();
		System.out.println(c1.x);
		c1.fo();
	}
}