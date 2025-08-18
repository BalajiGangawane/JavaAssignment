package JavaAssignment2;

public class Circle {
	int radius;
	Circle()
	{
		int r = 12;
		double C=2*3.14*r;
		System.out.println("Curcumference of circle of non parameterised constructor" + C);
	}
	   Circle(int r,double pi)
	   {
		   double c=2*pi*r;
		   System.out.println("Curcumference of circle ofparameterised constructor" + c);
	   }
	   public static void main(String[] args)
	   {
		   Circle c1=new Circle();
		   Circle c2=new Circle(5, 3.14);
	   }
}
