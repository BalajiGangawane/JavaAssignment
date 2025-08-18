package JavaAssignment2;

class Tea11
{
	public void describe()
	{
		System.out.println("Which types of tea :");
	}
}
	class Black extends Tea11
	{
		public void describe()
		{
			super.describe();
			System.out.println("This is black tea :");

		}
	}
     class Green extends Tea11
{
	public void describe()
	{
		super.describe();
		System.out.println("This is green tea :");

	}
}
public class PolywithArray {
	public static void main(String[] args)
	{
		Black a1=new Black();
		a1.describe();
		Green a2=new Green();
		a2.describe();
		
	
	}

}
