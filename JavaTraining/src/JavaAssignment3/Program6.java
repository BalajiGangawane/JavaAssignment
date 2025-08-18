package JavaAssignment3;

public class Program6
{
	int a=5;
	int b=5;

Program6()
{
	this.a=a;
	this.b=b;
	int c=a+b;
	System.out.println(c);
	
	}
public static void main(String[] args)
{
	System.out.println("this is non parameterised constructor");
	Program6 obj=new Program6();
}
}
