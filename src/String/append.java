package String;

import java.util.Scanner;

public class append 
{
	public static void main(String argsp[])
	{
		System.out.print("Enter 1st string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.print("Enter 2nd string");
		String s2=sc.next();
		StringBuilder s=new StringBuilder(s2);
		s.append(s1);
		System.out.println("Appended string="+s);
		sc.close();
	}
}
