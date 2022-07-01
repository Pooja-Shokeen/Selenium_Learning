package pkg1;

public class constructor {
	public constructor()
	{
		this(1,2);
		System.out.println("default");                             // one, two, default 
	}
	
	public constructor(int a)
	{
		System.out.println("one");
	}
	
	public constructor(int a, int b)
	{
		System.out.println("two");
	}
	
	public static void main(String[] args)
	{
		constructor obj=new constructor();
	}
}
