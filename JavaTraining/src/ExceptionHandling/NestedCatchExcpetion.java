package ExceptionHandling;

public class NestedCatchExcpetion {
	public static void main(String[] args)
	{
		try
		{
			int a=4;
			int b=0;
			int c;
			c=a/b;
		
			System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			try 
			{

				String str=null;
				System.out.println(str.length());
			}
			catch(NullPointerException ne)
			{
			System.out.println(ne);	
			}
			System.out.println(ae);
		}
	}

}
