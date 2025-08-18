package JavaAssignment3;

class A
{
int a=10;
}
class B extends A
{
	int b=20;
	
}
public class Program12 extends B {
	public static void main(String[] args)
	{
		Program12 obj=new Program12();
		
		int c;
		System.out.println(c=obj.a+obj.b);
		
	}

}
