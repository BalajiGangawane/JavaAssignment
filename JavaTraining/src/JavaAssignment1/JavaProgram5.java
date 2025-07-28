package JavaAssignment1;

import java.util.Scanner;

public class JavaProgram5 {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	
		if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        }
		else 
		{
            System.out.println(number + " is NOT a Prime Number.");
        }
}

    // Method to check if a number is prime
    public static boolean isPrime(int num) 
    {
        if (num <= 1)
        {
            return false; 
        }

       
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}

