package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException1 {

	public static void main(String[] args)
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("number is :" + num);
		}
		catch(InputMismatchException in)
		{
			System.out.println(in);
		}
		System.out.println("this io exception");
	}
}
