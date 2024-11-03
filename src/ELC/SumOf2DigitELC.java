package ELC;

import java.util.Scanner;
import BLC.TwoDigitSum;
public class SumOf2DigitELC 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int sum=TwoDigitSum.getSumOfTwoDigit(n);
		System.out.println("Sum of "+n+" is= "+sum);
		sc.close();
	}
}
