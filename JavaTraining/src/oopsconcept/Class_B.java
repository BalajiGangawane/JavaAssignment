package oopsconcept;

public class Class_B extends Class_A
{
	public static void main(String[] args)
	{
		Class_B b=new Class_B();
		b.add(10,20);
		b.sum(10,20);
	}
public void sum(int a,int b) 
{
	c=a-b;
System.out.println("sum of a and b is :" +c);
}
}
