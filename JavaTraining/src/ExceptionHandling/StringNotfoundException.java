package ExceptionHandling;

public class StringNotfoundException {
	public static void main(String[] args)
	{
	String str=null;
	try
	{
	System.out.println(str.length());
	}
	catch(NullPointerException n)
	{
		System.out.println(n);
	}
	System.out.println("string not found");
	String str2="Balaji";
	try
	{	
	System.out.println(str2.charAt(6));
	}
	catch(StringIndexOutOfBoundsException a)
	{
		System.out.println(a);
	}
	System.out.println("string out of size");
}}
