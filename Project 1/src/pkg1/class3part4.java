package pkg1;

public class class3part4
{
	public void m()
	{
		this.m3();
		System.out.println("default method");
	}
	public void m1()                          // we can call different methods using this multiple times
	{
		this.m();                            // will call m
		System.out.println("first method");
		this.m2();                           // will call m2
	}
	public void m2()
	{
		System.out.println("second method");
	}
	public void m3()
	{
		System.out.println("third method");
	}
	public void m4()
	{
		this.m2();        //It will call second method      
		System.out.println("fourth method");
	}
public static void main(String[] args) 
{
	class3part4 obj=new class3part4();
	obj.m4();    // It will call m4
}
	

}
