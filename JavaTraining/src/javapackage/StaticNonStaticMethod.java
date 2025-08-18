package javapackage;

public class StaticNonStaticMethod {
	
static int d=10; //Static global variable
int f=50;
	public static void add()  //Static method call in main methos directly
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	
	}
	
	public void mult() //Non Static method call in main method only by class object
	{
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
	}
	public static void main(String[] args)
	{
		StaticNonStaticMethod obj=new StaticNonStaticMethod();
		obj.add();
		sub();
		obj.mult();
	System.out.println(d);
	System.out.println(obj.d);
	System.out.println(StaticNonStaticMethod.d);
	System.out.println(obj.f);

	}

}
