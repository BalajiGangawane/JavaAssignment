package javapackage;
import java.util.*;
public class Practicefile 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int s=sc.nextInt();
		int a[]= {45,25,89,23,56,7};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(s==a[i])
			{
				System.out.println("elemrnt is fount at : " +i);
				flag=true;
				break;
			}
			}
		if(flag==false)
		{
			System.out.println("element not found");
		}
	
	}
}
