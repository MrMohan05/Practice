package BLC;
import java.util.*;
public class BankElc 
{
	public static void main(String args[])
	{
		BankBlc c1=new BankBlc();
		
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter customer name:");
			String n=sc.nextLine();
			
			System.out.print("Enter Contact number:");
			long m=sc.nextLong();
			
			System.out.print("Enter Account number:");
			int a=sc.nextInt();
			
			c1.setCustomerData(n,m,a);
			System.out.println(c1.DispBank());
			System.out.println(c1.DispCus());
			
			while(true)
			{
			System.out.print("\nEnter 1 for deposite     2 for Withdraw:");
			int ch=sc.nextInt();
			
			switch(ch) 
			{
			case 1:
			System.out.print("\nEnter deposite amount:");
			double d=sc.nextDouble();
			c1.Deposite(d);
			c1.dispbal();
			break;
			
			case 2:
			System.out.print("\nEnter Withdraw amount:");
			double w=sc.nextDouble();
			c1.Withdraw(w);
			c1.dispbal();
			break;
			
			default: System.out.println("Enter valid choice:");
			}
			}
		}
	}
}
