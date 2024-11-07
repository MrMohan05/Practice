package practice;
import java.util.Scanner;
public class Palindrom 
{
	public static void main(String args[])
	{
		System.out.print("Enter Number:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter String:");
		String s=sc.nextLine();
		System.out.printf("Number=%d String=%s",n,s);
		int i,j,l=s.length();
//		for(char c:s.toCharArray())
//		{
//			l++;
//		}
		i=0;
		j=l-1;
		boolean b=true;
		char []c=s.toCharArray();
		while(i!=j)
		{
			if(c[i]!=c[j])
			{
				b=false;
				break;
			}
			i++;
			j--;
		}
		if(b)
		{
			System.out.print("\nString is palindrom:");
		}
		else
		{
			System.out.print("\nString is not palindrom:");
		}
		
		int k=n,r,d=0;
		while(k!=0)
		{
			r=k%10;
			d=(d*10)+r;
			k/=10;
		}
		if(d==n)
		{
			System.out.print("\nNumber is palindrom:");
		}
		else
		{
			System.out.print("\nNumber is not palindromm:");
		}
		sc.close();
	}
}
