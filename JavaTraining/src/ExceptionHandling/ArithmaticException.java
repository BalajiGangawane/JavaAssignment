package ExceptionHandling;

public class ArithmaticException {

	
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		System.out.println("Exception Handling Scenario");
		try
		{
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
		System.out.println(ae);	
		}
			System.out.println("this exception is arithmetic and handle in try catch block");
	}
}
