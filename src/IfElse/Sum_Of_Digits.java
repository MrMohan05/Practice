package IfElse;

public class Sum_Of_Digits
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		if(n>9 && n<100)
		{
			int r,d;
			r=n%10;
			d=n/10;
			System.out.println("Sum of digits="+(r+d));
		}
		else if(n<0)
		{
			System.out.println("-3");
		}
		else if(n>99)
		{
			System.out.println("-2");
		}
		else
		{
			System.out.println("-1");
		}
	}
}
