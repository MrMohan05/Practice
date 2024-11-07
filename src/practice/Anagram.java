package practice;
import java.util.*;
public class Anagram 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st string:");
		String s1=sc.nextLine();
		System.out.print("Enter 2nd string:");
		String s2=sc.nextLine();
		int l=s1.length();
//		for(char c:s1.toCharArray())
//		{
//			l++;
//		}
		int i,j;
		char []c=s1.toCharArray();
		char m;
		for(i=0;i<l-1;i++)
		{
			for(j=i+1;j<l;j++)
			{
				if(c[i]>c[j])
				{
					m=c[i];
					c[i]=c[j];
					c[j]=m;
				}
			}
		}
		char []c1=s2.toCharArray();
		for(i=0;i<l-1;i++)
		{
			for(j=i+1;j<l;j++)
			{
				if(c1[i]>c1[j])
				{
					m=c1[i];
					c1[i]=c1[j];
					c1[j]=m;
				}
			}
		}
		s1=new String(c);
		System.out.println(s1);
		s2=new String(c1);
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String are anagram:");
		}
		else
		{
			System.out.println("String are not anagram:");
		}
	}
	
}
