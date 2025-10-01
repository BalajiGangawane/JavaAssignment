package ExceptionHandling;

public class NestedTryException {
	
	public static void main(String[] args)
	{
		int a=4;
		int b=0;
		int c;
		String str="Balaji";
		try
		{
			
		try
		{
			System.out.println(str.charAt(9));
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);		
	    }
		c=a/b;
		System.out.println(c);
		}
	catch(ArithmeticException ae)
		{
		System.out.println(ae);
		}
	
System.out.println("this nested try exception program");
}
}