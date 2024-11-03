package String;
import java.util.*;
public class tostring 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a string:");
//	String s=sc.next();
	StringBuilder sb=new StringBuilder("mohan");
	System.out.println("String in reverse="+sb);
	String s2=sb.toString();
	sc.close();
	System.out.println("String in reverse="+s2);
	}
}
