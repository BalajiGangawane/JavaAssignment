package StringPrograms;
import java.util.*;
public class NumberPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		if(a<0)
		{
			System.out.println("entered number is negative");
		}
		else if(a>0)
		{
			System.out.println("entered number is positive");
		}
		else
		{
			System.out.println("entered number is zero");
		}
	}
	
}
