package JavaAssignment2;

public class Person {
	String name;
	int age;
	Person()
	{
		System.out.println("this is constructor");
	}
	public String getter(String name)
	{
		return name;
	}
public int getter(int age)
{
	return age;
}
public static void main(String[] args)
{
	Person p=new Person();
	System.out.println("Age " + p.getter(29));
	System.out.println("Name " +p.getter("Balaji"));
	
}
}
