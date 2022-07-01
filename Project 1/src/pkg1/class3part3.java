package pkg1;

public class class3part3 
{
	public class3part3()
	{
	this(1,2,3);                                 // this keyword is used to call one constructor from another
	System.out.println("default constructor");	
	}
	
	public class3part3(int a)
	{
	this();  //it will call default constructor             // will use this  in above line
	System.out.println("one parameterized constructor");	
	}
	
	public class3part3(int a, int b)
	{
	this(12);  // will call one parameterized
	System.out.println("two parameterized constructor");	
	}
	
	public class3part3(int a, int b, int c)
	{
	System.out.println("three parameterized constructor");
	}
	
	public class3part3(int a, int b, int c, int d)
	{
	this(1,2);   // will call two parameterized
	System.out.println("four parameterized constructor");
	}
public static void main(String[] args) 
{
	class3part3 obj=new class3part3(12, 13, 14, 15);
}

}
