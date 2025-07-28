package JavaAssignment1;

import java.util.Scanner;

public class JavaProgram10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer");
		int number=sc.nextInt();
		 number = Math.abs(number);

	        int count = 0;

	        // Special case for 0
	        if (number == 0) {
	            count = 1;
	        } else {
	            while (number > 0) {
	                count++;
	                number /= 10;
	            }
	        }

	        System.out.println("Number of digits: " + count);
	    }
	}
