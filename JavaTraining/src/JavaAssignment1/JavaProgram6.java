package JavaAssignment1;
import java.util.*;
public class JavaProgram6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
			
		}
		System.out.println("The Factorial of number is :"+fact);
	}
}
