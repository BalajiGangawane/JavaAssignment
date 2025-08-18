package oopsconcept;

class Inheritance1 {
	//int a=10;
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;

}
public class Inheritance2 extends Inheritance1
{
    int a=30;
	public static void main(String[] args)
	{
		Inheritance2 obj=new Inheritance2();
		System.out.println("value of:" +obj.a);
		System.out.println("Value of:" +obj.a);
	}
	
}
