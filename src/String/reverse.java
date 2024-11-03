package String;
import java.util.*;
public class reverse 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		sc.close();
		System.out.println("String in reverse="+sb);
	}
}
