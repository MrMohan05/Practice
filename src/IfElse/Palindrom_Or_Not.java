package IfElse;

public class Palindrom_Or_Not 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		if(n>99 && n<1000)
		{
			int r,d=0,m;
			m=n;
			while(m!=0)
			{
				r=m%10;
				d=(d*10)+r;
				m/=10;
			}
			if(d==n)
			{
				System.out.print("1\nNumber is palindrom");
			}
			else
			{
				System.out.print("0\nNumber is not palindrom");
			}
		}
		else if(n<1)
		{
			System.out.println("-1\nNumber is negative number");
		}
		else if(n<100 || n>999)
		{
			System.out.println("-2\nThis program cheacks for only 3 digit number");
		}
		
	}
}
