package JavaAssignment3;

public class Program7 {
	
	Program7(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
public static void main(String[] args)
{
	System.out.println("this is parameterised constructor");
	Program7 obj=new Program7(4,8);
}
}
