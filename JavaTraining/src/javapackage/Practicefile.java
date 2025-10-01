package javapackage;
import java.util.*;

public class Practicefile
{	
			
public static void main(String[] args)
	{
	try
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("Result :" + c);
	}
	catch(ArithmeticException ae)
	{
		
    System.out.println(ae);
	}

}}

