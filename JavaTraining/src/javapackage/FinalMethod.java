package javapackage;

class add
{
	final public void a()
	{
		System.out.println("this is class add method");
	}
}
public class FinalMethod extends add {
	public void a()
	{
		System.out.println("this is finalmethod class method");
		super.a();
	}
	public static void main(String[] args)
	{
		FinalMethod obj=new FinalMethod();
		obj.a();
		
	}

}
