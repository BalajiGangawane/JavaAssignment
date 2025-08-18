package JavaAssignment3;
interface A1
{
	public void add();
}
class B1
{
	int a=20;
	int b=10;
}
public class Program5 extends B1 implements A1
{

	public void add()
	{
		int d=a+b;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Program5 obj=new Program5();
		obj.add();
	
	}

}



