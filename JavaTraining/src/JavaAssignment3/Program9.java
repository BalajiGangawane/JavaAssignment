package JavaAssignment3;

public class Program9 {
	String str="Balaji";
	String str1="Gangawane";
public void name(int age)
{
	this.str=str;
	this.str1=str1;
	System.out.println("Full name :" + str + " "+ str1);
	System.out.println("age " +age);
}
public void name(String str1,String str2,int age)
{
	System.out.println("Full name :" + str1 + " " + str2);
	System.out.println("age " +age);
}
public static void main(String[] args)
{
	Program9 obj=new Program9();
	obj.name(29);
	obj.name("Durga","Gangawane", 23);
}
}
