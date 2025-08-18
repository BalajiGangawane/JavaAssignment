package oopsconcept;

public class MethodOverloading1 {
	public void add(int a,int b,int c)
	{
	System.out.println("Method first :"+ (a+b+c));
	}
	public void add(int a,double b)
	{
		System.out.println("method second :"+ (a+b));
	}
public static void main(String[] args)
{
	MethodOverloading1 M= new MethodOverloading1();
	M.add(2, 3, 4);
	M.add(5, 3.5);
	
}
}
