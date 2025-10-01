package oopsconcept;

class Encap
{
	private int age;
	private String name;
	private double height;
	int getage()
	{
		return age;
	}
	void setage(int age)
	{
	this.age=age;	
	}
	String getname()
	{
		return name;
	}
	void setname(String name)
	{
		this.name=name;
	}
	double getheight()
	{
		return height;
	}
	void setheight(double height)
	{
	this.height=height;
	}
}

public class EncapsulationCode extends Encap
{
	
	public static void main(String[] args)
	{
EncapsulationCode obj=new EncapsulationCode();
obj.setage(29);
obj.setname("Balaji");
obj.setheight(5.6);
System.out.println("age " + obj.getage());
System.out.println("name " + obj.getname());
System.out.println("height " + obj.getheight());
}

}



