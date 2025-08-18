package javapackage;

import java.util.*;
public class PrimeNumberProgram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num +"its prime number");
		}
		else
		{
			System.out.println(num +" not prime number");
		}
	}
}
