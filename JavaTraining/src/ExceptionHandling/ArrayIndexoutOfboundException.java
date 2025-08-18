package ExceptionHandling;

public class ArrayIndexoutOfboundException {
	public static void main(String[] args)
	{
		int a[]= {45,58,59,56,23,48};
		System.out.println("Size of Array is: "+ a.length);
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println("Element of array :"+ a[i]);
		}*/
		try
		{
		System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		System.out.println("ArrayIndexoutofbound exception");
	}

}
