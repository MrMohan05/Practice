package practice;

import java.util.Scanner;
public class BillGenerator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 values of array:");
		int a[]=new int[7];
		for(int i=0;i<7;i++)
		{
			a[i]=sc.nextInt();
		}
		int i;
		for(i=0;i<7;i++)
		{
			switch(i)
			{
			case 0:
				System.out.println("Sunday="+a[i]);
				break;
			case 1:
				System.out.println("Monday="+a[i]);
				break;
			case 2:
				System.out.println("Wednsday="+a[i]);
				break;
			case 3:
				System.out.println("Tuesday="+a[i]);
				break;
			case 4:
				System.out.println("Thursday="+a[i]);
				break;
			case 5:
				System.out.println("Friday="+a[i]);
				break;
			case 6:
				System.out.println("Saturday="+a[i]);
				break;
				
			}
		}
	}
}

