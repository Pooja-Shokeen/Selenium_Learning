package pkg1;

public class class5child extends class5
{
	public class5child()
	{
		this(7,8);
		System.out.println("child default constructor");
	}
	public class5child(int a)
	{
		this(1,2,3,4);
		System.out.println("child one parameterized constructor");
	}
	public class5child(int a, int b)
	{
		super(2);
		System.out.println("child two parameterized constructor");
	}
	public class5child(int a, int b, int c)
	{
		this();
		System.out.println("child three parameterized constructor");
	}
	public class5child(int a, int b, int c, int d)
	{
		this(5,6,7);
		System.out.println("child four parameterized constructor");
	}
	
	public static void main(String[] args)
	{
		class5child obj=new class5child(12);
	}


}
