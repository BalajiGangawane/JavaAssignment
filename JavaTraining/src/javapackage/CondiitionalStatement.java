package javapackage;
import java.util.*;

public class CondiitionalStatement {

	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	public static void main(String[] args)
	{
		CondiitionalStatement obj=new CondiitionalStatement();
		//obj.ifstatement();
		
		//ifelsestatement();
		//ifelseifstatement();
		nestedifstatement();
	}
	public void ifstatement()
	{
		System.out.println("enter the value of a:");
			a=sc.nextInt();
		
		System.out.println("enter the value of b:");
	        b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is bigger");
		}

	}

	public static void ifelsestatement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is bigger than b");
		}
		else
		{
			System.out.println("a is smaller than b");
		}

	}

			public static void ifelseifstatement()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the value of a:");
				int a=sc.nextInt();
				System.out.println("enter the value of b:");
				int b=sc.nextInt();

				if(a>b)
				{
					System.out.println("a is bigger than b");
				}
				else if(a==b)
				{
					System.out.println(" a is equal to b ");
				}
				else
				{
					System.out.println("a is smaller than b");
				}
}

		public static void nestedifstatement()
			{
				//Height and long jump both condition are eligible for army selection"h 7f or more and jump=15m more
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the value of hight:");
				float H=sc.nextInt();
				System.out.println("enter the value of jump:");
				float J=sc.nextInt();
                if(H>=7)
                {
                	if(J>=15)
                	{
                		System.out.println("person is eligible as jumpand Height is matched");
                	}
                	else
                	{
                		System.out.println("person is not eligible as jump is not matched");
                	}
                }
                else
                	{
                		System.out.println("person is not eligible as height  is not  matched");
                	}
               
                
				
			
}

}