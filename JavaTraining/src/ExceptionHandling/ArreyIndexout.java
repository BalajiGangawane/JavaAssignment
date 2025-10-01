package ExceptionHandling;

public class ArreyIndexout {
	public static void main(String[] args)
	{
		try
		{
			int a[]= {10,25,14,23,56};
			System.out.println(a.length);
			System.out.println("Result :" + a[10]);
		}
		catch(ArrayIndexOutOfBoundsException ae1)
		{
			System.out.println(ae1);
		}
	}

}
