package oopsconcept;

public class Interface2 implements Interface1{
	void cat()
	{
		System.out.println("this is cat method");
	}
	public void animal()
	{
		System.out.println("his is animal method");
	}
	public void bird()
	{
	System.out.println("this this bird method");
	}
	
	public static void main(String[] args)
	{
		Interface2 obj=new Interface2();
		obj.animal();
		obj.bird();
		obj.cat();
	}

}
