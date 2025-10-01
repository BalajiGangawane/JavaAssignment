package ExceptionHandling;

public class TrywithMultiplecatch {
	public static void main(String[] args) {
		
		try
		{
			String str=null;
			System.out.println("length is :" + str.length());
			int a=10;
			int b=0;
			int c;
			c=a/b;
			System.out.println("add " + c);
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		catch(ArithmeticException se)
		{
			System.out.println(se);
		}
		
		System.out.println("this is try with multiple catch exception program");
	}

}
