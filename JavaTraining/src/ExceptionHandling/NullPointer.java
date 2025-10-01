package ExceptionHandling;

public class NullPointer {
	public static void main(String[] args)
	{
		try
		{
		String str=null;
		System.out.println("Result :" + str.length());
		}
	
	catch(NullPointerException ne)
	{
		System.out.println(ne);
	}

}
}