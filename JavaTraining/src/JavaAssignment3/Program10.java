package JavaAssignment3;

class Program
{
	int c;
	public void add(int a,int b)
	{
	c=a+b;
		System.out.println("Addition belong to program class :" + c);
		
	}
}
public class Program10 extends Program {
	
	int c;
	public void add(int a,int b)
	{
	c=a+b;
		System.out.println("Addition belong to program10 class :" + c);
		super.add(4,8);
	}
	
	
public static void main(String[] args)
{
	Program10 obj=new Program10();
	obj.add(4,5);
}
}
