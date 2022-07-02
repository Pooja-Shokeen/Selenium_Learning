package pkg1;

public class class5
{
	public class5()
	{
		this(1,2,3);
		System.out.println("parent default constructor");
	}
	public class5(int a)
	{
		this(1,2);
		System.out.println("parent one parameterized constructor");
	}
	public class5(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("parent two parameterized constructor");
	}
	public class5(int a, int b, int c)
	{
		System.out.println("parent three parameterized constructor");
	}
	public class5(int a, int b, int c, int d)
	{
		this();
		System.out.println("parent four parameterized constructor");
	}
	
	public static void main(String[] args)
	{
		class5 C=new class5();
	}

}
