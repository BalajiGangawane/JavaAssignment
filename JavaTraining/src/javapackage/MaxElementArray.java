package javapackage;
import java.util.*;
public class MaxElementArray {
	public static void main(String[] args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int max=sc.nextInt();*/
		int a[]= {45,85,12,36,89,400,500,57};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		
		}
	System.out.println(max);

}}
