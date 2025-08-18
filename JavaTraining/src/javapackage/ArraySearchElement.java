package javapackage;
import java.util.*;
public class ArraySearchElement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element want to search");
		int search_E=sc.nextInt();
		boolean flag=false;
		int a[]= {10,56,82,45,12,36};
		for(int i=0;i<a.length;i++)
		{
		
	if(search_E==a[i])
			{
				System.out.println("Element is found " +i);
				flag=true;
				break;
			}}
	     if(flag==false)
	{
	System.out.println("Element not found");	
	}
		}
	

}
