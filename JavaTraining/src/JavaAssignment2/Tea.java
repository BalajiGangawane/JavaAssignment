package JavaAssignment2;

public class Tea {
	public void prepareTea()
	{
		int hot_water;
		int tea_leave;
		System.out.println("Basic tea prepared with hot water and tea leave ");
	}
	public void addmilk()
	{
		int milk;
		System.out.println("Basic tea prepared by adding milk ");
	}
	public void addsugar()
	{
		int sugar;
		System.out.println("Basic tea prepared by adding sugar ");	
	}

	public static void main(String[] args)
	{
		Tea t=new Tea();
		t.prepareTea();
		t.addmilk();
		t.addsugar();
	}
}
