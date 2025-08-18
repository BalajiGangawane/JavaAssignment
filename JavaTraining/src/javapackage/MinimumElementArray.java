package javapackage;

public class MinimumElementArray {

	public static void main(String[] args)
	{
		int a[]= {10,52,86,9,7,633};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i] < min)

			{
				min=a[i];
				
			}
			
		}
		System.out.println(min);
	}
	
}
