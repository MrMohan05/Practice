package Practice;

public class Twomethodsdiffclass 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		calculation.sum(n, m);
		calculation.sub(n, m);
		calculation.mul(n, m);
		calculation.div(n, m);
		System.out.print("All calcuations are done");
	}
}

class calculation
{
	public static void sum(int n,int m)
	{
		int sum=n+m;
		System.out.print("Sum=");
		display.disp(sum);
	}
	public static void sub(int n,int m)
	{
		int sub;
		if(n>m)
		sub=n-m;
		else
		sub=m-n;
		System.out.print("sub=");
		display.disp(sub);
	}
	public static void mul(int n,int m)
	{
		int mul=n*m;
		System.out.print("mul=");
		display.disp(mul);
	}
	public static void div(int n,int m)
	{
		float div=n/m;
		System.out.print("div=");
		display.disp(div);
	}
}

class display
{
	public static void disp(float d)
	{
		System.out.println(d);
	}
}
