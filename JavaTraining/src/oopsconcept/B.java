package oopsconcept;

class A 
{
	
public void add(int a,int b)
	 {
	 System.out.println(" class A method : " + (a+b));
	 }
	 
	}
class B extends A

	{
	
public void add(int a,int b)
	 {
	 System.out.println(" class B method : " + (a+b));
	 super.add(5, 6);
	 }
	 
public static void main(String[] args)
{
	 B b=new B();
	 b.add(12,10);
	 }
	}

