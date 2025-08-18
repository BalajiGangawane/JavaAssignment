package JavaAssignment2;

public class Employees {
	int id;
	String name;
	int salary;
	
	public int getter(int id)
	{
		return id;
	}
	public String getter(String name)
	{
		return name;
	}
	public void RaisedSalary(int percent,int salary)
	{
		int Annualsalary=salary*12;
		System.out.println("Annual salary " + Annualsalary);
		int raisedsalary=Annualsalary+Annualsalary*9/100;
		System.out.println("add Raised Salary in annual salary and new Annual salary is :" + raisedsalary);
	}
public static void main(String[] args)
{
	Employees e=new Employees();
	System.out.println("Employee ID :"+ e.getter(1160));
	System.out.println("Employee Name :"+ e.getter("Balaji Gangawane"));
	e.RaisedSalary(9, 55000);
	
}
}
