package JavaAssignment1;

import java.util.Scanner;

public class JavaProgram11 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();

        if (number <= 1)
        {
            System.out.println("its not prime number");
        }
        if(number%2==0)
{
            System.out.println("its not prime number");

}
       
        for (int i = 3; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0)
            {
            	System.out.println("its not prime number");
            }
        }
        System.out.println("its prime number");
        
}

}

