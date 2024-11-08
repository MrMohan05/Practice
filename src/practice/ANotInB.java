package practice;

import java.util.Scanner;

public class ANotInB
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1=sc.next();
		System.out.println("Enter 2nd string");
		String s2=sc.next();
		
		char ch2;
		int c1=0;
		String c="";
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			c1=0;
			for(int j=0;j<s2.length();j++)
			{
				ch2=s2.charAt(j);
				if(ch1==ch2)
				{
					c1++;
				}
			}
			if(c1==0)
			{
				c+=ch1;
			}
		}
		System.out.println("Not in 2nd String="+c);
		sc.close();
	}
}
