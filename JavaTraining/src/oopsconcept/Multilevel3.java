package oopsconcept;

class Multilevel1
{

	int c;
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println("add is:" +c);
	}
}
class Multilevel2 extends Multilevel1
{
	public void sum(int a,int b)
	{
		c=a-b;
		System.out.println("sum is:" +c);

	}
}
public class Multilevel3 extends Multilevel2
{
	public void multi(int a,int b)
	{
		c=a*b;
		System.out.println("multi is:" +c);

	}
	public static void main(String[] args)
	{
		Multilevel3 ob=new Multilevel3();
		ob.add(10, 20);
		ob.sum(20,10);
		ob.multi(10, 20);
	}
}