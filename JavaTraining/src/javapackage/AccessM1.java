package javapackage;

public class AccessM1 {
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	
	/*
	 * within class*/
	public static void main(String[] args)
	{
		AccessM1 obj=new AccessM1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	}
	

}
