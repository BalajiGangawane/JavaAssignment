package JavaAssignment3;


abstract class Animal
{
	abstract public void dog();
	public void cat()
	{
		System.out.println("this is cat menthod");
	}
}
public class Program1 extends Animal {
	public void study()
	{
		System.out.println("this study method");
	}
	public void dog() {
		System.out.println("this abstract method");
	}
	public static void main(String[] args)
	{
		Program1 obj=new Program1();
		obj.cat();
		obj.dog();
		obj.study();
		
	}

}
