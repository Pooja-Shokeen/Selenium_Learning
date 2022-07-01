package pkg1;

public class class3part2 
{
	int a,b,c,d,e;          // global variables(can be used anywhere inside whole class)
	
	public class3part2(int a1, int a2, int a3, int a4, int a5)    // constructor
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	public static void main(String[] args) 
	{
	class3part2 obj=new class3part2(12,24,36,48,60);    // creating object
	    System.out.println(obj.a);
	    System.out.println(obj.b);
	    System.out.println(obj.c);
	    System.out.println(obj.d);
	    System.out.println(obj.e);
	}
	

}
