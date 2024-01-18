class Sample3
{
	int x=10;
}

class Demo3 extends Sample3
{
	void disp()
	{
		System.out.println("Hello");
	}
}

class Tester3 extends Sample3 
{
	void fo()
	{
		System.out.println("hey it's foo");
	}

}

class Mainclass3
{
	public static void main(String[] args)
	{
		Demo3 d1=new Demo3();
		System.out.println(d1.x);
		d1.disp();

		Tester3 t1=new Tester3();
		System.out.println(t1.x);
		t1.fo();
	}
}