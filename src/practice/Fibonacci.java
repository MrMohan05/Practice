package practice;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c=0,i,n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number to print fibonacci series=");
			n=sc.nextInt();
			for(i=0;i<=n;i++)
			{
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
			}
		}
	}
}
