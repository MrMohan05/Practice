package Variables;

import java.util.Scanner;

public class NonStaticMethod 
{
	public void acp()
	{
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter 1st number");
		int n=sc.nextInt();
		System.err.println("Enter 2nd number");
		int m=sc.nextInt();
		sc.close();
		NonStaticMethod ac=new NonStaticMethod();
		int sum=n+m;
		ac.disp(sum);
	}
	public void disp(int n)
	{
		System.out.println("Sum="+n);
	}
	public static void main(String args[])
	{
		System.out.println("Calling acp method which is non static:");
		NonStaticMethod ac=new NonStaticMethod();
		ac.acp();
	}
}
