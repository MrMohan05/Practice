package Practice;
import java.util.Scanner;

public class sinput 
{
	public static void main(String args[])
	{
		int n,m;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st number");
			n=sc.nextInt();
			System.out.println("Enter 2nd number:");
			m=sc.nextInt();
		}
		System.out.println("n="+n+" m="+m);
	}
}
