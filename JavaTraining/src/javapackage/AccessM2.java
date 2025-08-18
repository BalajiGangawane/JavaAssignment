package javapackage;

public class AccessM2 extends AccessM1 {
	int a1=50;
	public static void main(String[] args)
	{
		AccessM2 obj2=new AccessM2();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		//System.out.println(obj2.d);
		System.out.println(obj2.a1);
		//same package in sub class
	}

}
