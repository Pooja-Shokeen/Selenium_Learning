package pkg1;

///    ((((x1+x2)+x3)-x4)*x5)/x6)

import java.util.Scanner;

public class class6_Scanner
{
public int sum(int a, int b)
{
	int c;
	c=a+b;
	return c;
}
public int sub(int a, int b)
{
	int c;
	c=a-b;
	return c;
}
public int multi(int a, int b)
{
	int c;
	c=a*b;
	return c;
}
public int div(int a, int b)
{
	int c;
	c=a/b;
	return c;
}

public static void main(String[] args) 
{
	Scanner ob=new Scanner(System.in);
	class6_Scanner object=new class6_Scanner();
	
	System.out.println("please enter value of x1");
	int x1=ob.nextInt();
	System.out.println("please enter value of x2");
	int x2=ob.nextInt();
	int sum=object.sum(x1, x2);
	System.out.println("result of (x1 +x2) is " +sum);
	System.out.println("please enter value of x3");
	int x3=ob.nextInt();
	int sum2=object.sum(sum, x3);
	System.out.println("result of (x1+x2)+x3 is " +sum2);
	System.out.println("please enter value of x4");
	int x4=ob.nextInt();
	int sub=object.sub(sum2, x4);
	System.out.println("result of ((x1+x2)+x3)-x4 is " +sub);
	System.out.println("please enter value of x5");
	int x5=ob.nextInt();
	int multi=object.multi(sub, x5);
	System.out.println("result of (((x1+x2)+x3)-x4)*x5 is " +multi);
	System.out.println("please enter value of x6");
	int x6=ob.nextInt();
	int div=object.div(multi, x6);
	System.out.println("result of ((((x1+x2)+x3)-x4)*x5)/x6) is " +div);
	
	
			
}
}
