package String;
import java.util.*;
public class insert 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st string");
		String s1=sc.next();
		System.out.print("Enter position:");
		int n=sc.nextInt();
		System.out.print("Enter 2nd string");
		String s2=sc.next();
		sc.close();
		StringBuilder sb=new StringBuilder(s1);
		sb.insert(n,s2);
		System.out.println("Inserted string="+sb);
	}
}
