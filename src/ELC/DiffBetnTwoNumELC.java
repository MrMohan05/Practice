package ELC;
import java.util.*;
import BLC.*;
public class DiffBetnTwoNumELC 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int d=TwoDigitsDifference.getDiffOfDigits(n);
		System.out.println("Diffrence of "+n+" is "+d);
		sc.close();
	}
}
