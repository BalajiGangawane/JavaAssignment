package oopsconcept;

public class Methodoverriding3 extends MethodOverriding2 {
	int c;
	public void add(int a,int b)
	{
		super.add(4, 6);
		int c=a+b;
		System.out.println("second class method :"+ c);
		
	}
public static void main(String[] args)
{
	Methodoverriding3 M1=new Methodoverriding3();

	M1.add(5, 6);
}
}
