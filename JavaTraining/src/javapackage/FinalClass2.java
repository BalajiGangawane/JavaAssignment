package javapackage;

final class FinalClass1 {
	public void add()
	{
		System.out.println("this is add method");
	}}
public class FinalClass2 extends FinalClass1
{
	public static void main(String[] args)
	{
		FinalClass2 obj=new FinalClass2();
		
		obj.add();
	}
}

