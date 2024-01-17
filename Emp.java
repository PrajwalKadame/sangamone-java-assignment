class Emp
{
	String e_id;
	String e_grade;
    int e_sal;

		Emp(String a,String b,int c)
		{
			e_id=a;
			e_grade=b;
			e_sal=c;
		}

	public static void main(String[] args)
	{
		

		Emp e1=new Emp("TY8143","Engineer",250000);
		System.out.println("The Emp id is "+e1.e_id);
		System.out.println("The Emp grader is "+e1.e_grade);
		System.out.println("The Emp sal is "+e1.e_sal);
	}

	
}