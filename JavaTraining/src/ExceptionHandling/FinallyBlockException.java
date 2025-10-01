package ExceptionHandling;

public class FinallyBlockException {
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("this block always executed even throwing excpeyion");
		}
	}

}
