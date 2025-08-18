package JavaAssignment2;

public class Account {
	int balance;
	Account()
	{
		System.out.println("Account balance history");
	}
	Account(int w,int d)
	{
		
		System.out.println("Amount withdrawal process");
		System.out.println("Amount Deposite process");
	}
public void Withdraw(int balance,int w)
{
	this.balance=balance;
	int current_balance=balance-w;
	System.out.println("Balance after withdraw is :" + current_balance);
}
public void Deposite(int balance,int d)
{
	this.balance=balance;
	int current_balance=balance+d;
	System.out.println("Balance after deposite is :" + current_balance);
}
public static void main(String[] args)
{
	Account a=new Account();
	Account a1=new Account(100,500);
	a.Deposite(2000, 500);
	a.Withdraw(3000, 1000);
}
{
	
}
}
