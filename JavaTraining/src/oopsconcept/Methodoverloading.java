package oopsconcept;

public class Methodoverloading {

	public void add(int a,int b)
	{
		System.out.println("Addition of numbers is :"+ (a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition of numbers is :"+ (a+b+c));
	}
	public static void main(String[] args)
	{
	Methodoverloading M=new Methodoverloading();
	M.add(10,20);
	M.add(2, 2, 5);
			
	}
}
