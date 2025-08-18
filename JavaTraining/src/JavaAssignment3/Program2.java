package JavaAssignment3;

abstract class Arithmatic
{
	abstract public void add();
	abstract public void sub();
	abstract public void mul();
	int a=10;
	int b=20;
	int c;
	
}
public class Program2 extends Arithmatic {
	public void add()
	{
		c=a+b;
		System.out.println("abstract add methos " +c);
		
	}
	public void sub()
	{
		c=a-b;
		System.out.println("abstract sub methos " +c);
		
	}
	public void mul() {
		c=a*b;
		System.out.println("abstract mul methos " +c);
		
	}
public static void main(String[] args)
{
	Program2 obj=new Program2();
	obj.add();
	obj.sub();
	obj.mul();
}
}
