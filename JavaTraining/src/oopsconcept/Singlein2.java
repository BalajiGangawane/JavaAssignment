package oopsconcept;

public class Singlein2 extends SingleIn1 {

	public void sub(int a,int b)
	{
		c=a-b;
		System.out.println("Sub :"+ c);

}
	public static void main(String[] args)
	{
		Singlein2 s2=new Singlein2();
		s2.add(5, 3);
		s2.sub(10, 6);
	}
}
	
