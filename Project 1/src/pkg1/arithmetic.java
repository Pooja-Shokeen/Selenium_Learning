package pkg1;

public class arithmetic
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is " +c);
		return c;
	}
	public int sub(int p,int q)
	{
		int r;
		r=p-q;
		System.out.println("sub result is " +r);
		return r;
	}
	public int multi(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("multi result is " +z);
		return z;
	}
	public int div(int s,int t)
	{
		int u;
		u=s/t;
		System.out.println("div result is " +u);
		return u;
		
	}
	public static void main(String[] args) 
	{
		arithmetic A=new arithmetic();
		int div1 = A.div(10, 2);
		int sub1 = A.sub(div1, 2);
		int sub2 = A.sub(sub1, 2);
		int sum1 = A.sum( sub2, 2);
		A.multi(sum1, 2);
		
		
		
	}
	
}
