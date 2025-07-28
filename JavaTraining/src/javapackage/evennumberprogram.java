package javapackage;
import java.util.*;
public class evennumberprogram {
	public static void main(String[] args)
	{
		/*for(int i=0;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.println("given number is even number:" +i);

			}
		}*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		
		char ch=sc.next().toUpperCase().charAt(0);
	
		
		if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("itd vowel");
		}
		else
		{
			System.out.println("its consonant");
		}
	}

}
