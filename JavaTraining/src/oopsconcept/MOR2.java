package oopsconcept;

class MOR1
{
	
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	System.out.println("its parent class method");

}
}
public class MOR2 extends MOR1
{
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("its parent child method");
		super.add(2, 3);

	}
	public static void main(String[] args)
	{
		MOR2 obj=new MOR2();
		obj.add(10,20);
	}
}

