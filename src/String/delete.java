package String;
import java.util.*;
public class delete 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println("Enter delete start:");
		int s=sc.nextInt();
		System.out.println("Enter delete position");
		int e=sc.nextInt();
		sb.delete(s, e);
		System.out.println("After delete:"+sb);
		sc.close();
		sb.delete(2,4);
		System.out.println("again delete:"+sb);
	}
}
