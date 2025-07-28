package JavaAssignment1;
import java.util.*;
public class JavaProgram4 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter value of a");
	int a=sc.nextInt();
	System.out.println("eneter value of b");
	int b=sc.nextInt();
	System.out.println("before Swipping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	/*int c=a;
	a=b;
	b=c;
	System.out.println("after swipping");
	System.out.println("a="+a);
	System.out.println("b="+b);*/
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swipping");
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
