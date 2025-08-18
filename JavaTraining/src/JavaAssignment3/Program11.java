package JavaAssignment3;
class Water
{
	int c;
}
public class Program11 extends Water
{
	int a=10;
	int b=10;
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Program11 obj=new Program11();
		obj.add();
	}
}