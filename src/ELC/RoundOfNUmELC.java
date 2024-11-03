package ELC;
import java.util.*;
import BLC.RoundedSum;
public class RoundOfNUmELC 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st num:");
		int n=sc.nextInt();
		System.out.print("Enter 2nd num:");
		int m=sc.nextInt();
		System.out.print("Enter 3rd num:");
		int o=sc.nextInt();
		int sum=RoundedSum.sumOfRoundedValues(n, m, o);
		System.out.println("Sum of"+n+" "+m+" "+o+" is "+sum);
		sc.close();
	}
}
