package pkg1;

public class class3 
{
	public class3()
	{
	System.out.println("default constructor");	
	}
	
	public class3(int a)
	{
	System.out.println("one parameterized constructor");	
	}
	
	public class3(float a, int b)
	{
	System.out.println("two parameterized constructor");	
	}

public static void main(String[] args)
{
	class3 ob=new class3();
	class3 ob1=new class3(5);
	class3 ob2=new class3(5F, 10);   //for float values use F after 5.5
	
	
}
}
