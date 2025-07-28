package javapackage;

public class ShapesCalculations {
public static void main(String[] args) {

	circle();
	square();
	simpleinterest();
	average();
	curcumference();

}
	public static void circle()
	{
	int r=5;
	double pi=3.14;
	double c=pi*r*r;
	System.out.println("area of circle is :"+c);
	}
	public static void square()
	{
		int a=10;
		int s=a*a;
		System.out.println("area of square is :"+s);
	}
	public static void simpleinterest()
{
	int p=10;
	int r=8;
	int t=4;
	int si=p*r*t/100;
	System.out.println("simple interest is:"+si);
}
	public static void average()
	{
		int a=10;
		int b=20;
		int c=5;
		int d=35;
		int e=45;
		float average=a+b+c+d+e/5;
		System.out.println("average of 5 number is :"+average);
	}

public static void curcumference()
{
	int r=4;
	double pi=3.14;
	double c=2*pi*r;
	System.out.println("curcumference of circle is :"+c);
}
}