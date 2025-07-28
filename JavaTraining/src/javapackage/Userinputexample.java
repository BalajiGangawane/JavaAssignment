package javapackage;

import java.util.Scanner;
public class Userinputexample {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("enter the  two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of two number is :"+c);

		System.out.println("enter the value of radius:");
		int r=sc.nextInt();

		System.out.println("enter value of pi:");
		float pi=sc.nextFloat();

		float c=pi*r*r;

		System.out.println("area of circle:"+c);

		String name=sc.nextLine();
		System.out.println("this operation performed by:"+name);
		*/
		System.out.println("enter the name");
		char c=sc.nextLine().charAt(8);
		System.out.println(c);
	}

}
