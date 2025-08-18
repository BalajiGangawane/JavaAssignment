package oopsconcept;

public class ABSmain extends Abstract2 {

	void watch()
	{
		System.out.println("i am watching");
	}
	void eat()
	{
		System.out.println(" i am eating");
	}
	void play()
	{
		System.out.println(" i am playing");
	}
	
	public static void main(String[] args)
	{
		ABSmain m=new ABSmain();
		m.study();
		m.watch();
		m.eat();
		m.play();
	}}
