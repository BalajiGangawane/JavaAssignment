package StringPrograms;
import java.util.*;
public class Tableprogram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:" );
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int result=num*i;
			System.out.println(result);
		}
	}
}
