package StringPrograms;
import java.util.*;
public class StringMethod {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str1=sc.nextLine();
	StringBuilder str7=new StringBuilder("Durga");
	String str2="balaji";
	String str3="Durga ";
	String str4="Balaji Gangawane";
	/*System.out.println("lenght of String:"+ str1.length());
	System.out.println(str1.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.charAt(6));
	System.out.println("lenght of String:"+ str2.indexOf('j'));
	System.out.println("Full Name is :"+ str3.concat(str4));
	System.out.println("Sub string:" + str4.substring(7));
	System.out.println("lenght of String:"+ str4.substring(0,6));
	System.out.println("lenght of String:"+ str3.replace(" "," Bangar"));*/
	System.out.println("Reverse Name is:" + str7.reverse());
	
}
}
