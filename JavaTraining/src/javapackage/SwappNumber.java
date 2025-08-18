package javapackage;

public class SwappNumber {

	public static void main(String[] args)
	{
	int a=33;
	int b=54;
	System.out.println("Before swapp valus of a is :"+ a);
	System.out.println("Before swapp valus of b is :"+ b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapp valus of a is :"+ a);
	System.out.println("After swapp valus of b is :"+ b);	

	}
}
