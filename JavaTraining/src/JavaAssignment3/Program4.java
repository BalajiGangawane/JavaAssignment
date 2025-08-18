package JavaAssignment3;
interface X
{
	public void x();
}
interface Y
{
	public void y();
}
interface Z
{
	public void z();
}
public class Program4 implements X,Y,Z
{
	public void x()
	{
	System.out.println("X Methd");
	}
	public void y()
	{
		System.out.println("Y method");
	}
	public void z()
	{
		System.out.println("Z Method");
	}
	public static void main(String[] args)
	{
		Program4 obj=new Program4();
		obj.x();
		obj.y();
		obj.z();
		
	}
}




