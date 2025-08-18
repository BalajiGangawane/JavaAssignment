package JavaAssignment3;
interface Plant
{
	public void leaf();
	public void roots();
	public void steam();
	
}

public class Program3 implements Plant{
	
	public void leaf()
	{
	System.out.println("this is interface method");
	}
	public void flower()
	{
		System.out.println("this is main class method");
	}
	public void roots()
	{
		System.out.println("this is interface method");
	}
	public void steam()
	{
		System.out.println("this is interface method");
	}
	
public static void main(String[] args)
{
	Program3 obj=new Program3();
	obj.leaf();
	obj.flower();
	obj.roots();
	obj.steam();
	
}
}
