package JavaAssignment3;

public class Program8 {
	Program8(int a,double b)
	{
		System.out.println("this is simple constructor");
		double c=a+b;
		System.out.println(c);
	}
	Program8(int a,int b)
	{
		System.out.println("this is parameterised constructor");
		int c=a+b;
		System.out.println(c);
	}
public static void main(String[] args)
{
	Program8 obj1=new Program8(4,2.5);
	Program8 obj2=new Program8(4,4);
	
}
}
