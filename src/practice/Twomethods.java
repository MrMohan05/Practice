package practice;

public class Twomethods 
{
	public static void main(String args[])
	{
		System.out.println("Calling disp method:\n");
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		disp(n,m);
		int sum=sum(n,m);
		System.out.println("Sum="+sum);
		int sub=sub(n,m);
		System.out.println("Sub="+sub);
		int mul=mul(n,m);
		System.out.println("Mul="+mul);
		float div=div(n,m);
		System.out.println("Div="+div);
	}
	public static void disp(int n,int m)
	{
		System.out.println("Displaing user inputs:");
		System.out.println("1st number:"+n);
		System.out.println("2nd number:"+m);
	}
	public static int sum(int n,int m)
	{
		int sum=n+m;
		return sum;
	}
	public static int sub(int n,int m)
	{
		int sub=0;
		if(n>m)
		sub=n-m;
		else
		sub=m-n;
		return sub;
	}
	public static int mul(int n,int m)
	{
		int mul=n*m;
		return mul;
	}
	public static float div(int n,int m)
	{
		float div=n/m;
		return div;
	}
}
