package oopsconcept;

public class Constructor {

	int x;
	int y;
	//default constructor
	Constructor()
	{
		System.out.println("this is default constructor");
	}
	
	//parameteries constructor ond constructor overloading
	Constructor(int x,int y)
	{
		this.x=x;
		this.y=y;
		int c=x+y;
		System.out.println("Addition in parameterised construction is :" + c);
	}
	
public static void main(String[] args)
{
	Constructor obj1=new Constructor();
	Constructor obj2=new Constructor(4,6);
}
}
