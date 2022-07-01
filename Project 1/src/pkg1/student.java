package pkg1;

public class student 
{
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
    public static void main(String[] args) 
    {
    	student ob=new student();
    	ob.rollno=3;
    	System.out.println(ob.rollno);
    	ob.age=18;
    	System.out.println(ob.age);
    	ob.display1();
    	ob.display2();
    	
    }
   
}
