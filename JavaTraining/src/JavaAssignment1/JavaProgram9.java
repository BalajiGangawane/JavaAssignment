package JavaAssignment1;

import java.util.*;
public class JavaProgram9 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Age");
	int age=sc.nextInt();
	if(age>=60)
	{
		System.out.println("the person is a senior citizen");
	}
	else
	{
		System.out.println("the person is not a senior citizen");
	}
}
}
