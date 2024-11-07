package practice;
import java.util.Scanner;
public class Reverse 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to make it reverse:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a string to make it reverse:");
		String s=sc.next();
		int m=n,r,d=0;
		while(m!=0)
		{
			r=m%10;
			d=(d*10)+r;
			m/=10;
		}
		System.out.printf("\nNumber revrse=%d\n",d);
		m=s.length();
//		for(char c:s.toCharArray())
//		{
//			m++;
//		}
		m-=1;
		while(m!=-1)
		{
			System.out.print(s.charAt(m));
			m--;
		}
		sc.close();
	}
}
