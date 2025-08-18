package JavaAssignment2;

class Superclass
{
	public void prepareTea()
	{
		System.out.println("this super class method and sub classes will inheritate the method of super class TEA: ");
	}
}

class BlackTea extends Superclass
{
	public void prepareTea()
	{
		super.prepareTea();
		String s= "sugar";
		String t="tea_leave";
		double time=5.3;
System.out.println("Black tea prepared with: " +s +" " + " "+" with "+ time+ "minutes");
	}
}
class GreenTea extends BlackTea
{
	public void prepareTea()
	{
		super.prepareTea();
	String g="green_tea_leave";
	double time=4;
	System.out.println("Green tea prepared with :" + g + " "+ "with  "+ time + "minutes");
}
}
class HerbalTea extends GreenTea
{
	public void prepareTea()
	{
	
		super.prepareTea();
		String l= "lemongass";
		String t= "tulsi";
		double time=6;
		System.out.println("Herbal tea prepared with: " + l +" " + t + " "+ " with " + time + "minutes");
		
	}
}
public class Tea2 extends HerbalTea 
{
public static void main(String[] args)
{
	Tea2 t=new Tea2();
	t.prepareTea();
}
}
