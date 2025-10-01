package oopsconcept;

abstract class A2
{
	int a=10;
	int b=20;
	void add() // non abstract method
	{
		int c=a+b;
		System.out.println("this is non abstract method result " + c);
	}
	abstract void sub();

}
abstract class B2 extends A2
{
	abstract void div();
}
abstract class C2 extends B2
{
	
abstract void mul();
}
public class AbstractionCode extends C2
{
	void sub()
	{
		int c=a-b;
		System.out.println("this is abstract method of class A " + c);
	}
	void div()
	{
		int c=a/b;
		System.out.println("this is abstract method of class B " + c);
	}
	void mul()
	{
		int c=a*b;
		System.out.println("this is abstract method of class c " + c);
	}
	
public static void main(String[] args)
	{
AbstractionCode obj=new AbstractionCode();
obj.add();
obj.div();
obj.sub();
obj.mul();

}

}
