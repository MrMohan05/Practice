package arrays;

import java.util.Scanner;

public class TcsNQT 
{
	public static void main(String args[])
	{
		int n,i,j,c=0,squreof2=2,cnt=1;
		System.out.println("Enter array size:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] arr=new int [n];
		// On prime position 2 squre.
		// On perfect squre position 3 squre.
		// On remaning position previous 2 digits addition.
		
		for(i=2;i<n;i++)
		{
			c=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				arr[i]=squreof2;
				squreof2=squreof2*2;
			}
		}
		for(i=0;i<n;i++)
		{
			if(i==cnt*cnt)
			{
				arr[i]=cnt*cnt;
				cnt++;
			}
			if(arr[i]==0 && i>2)
			{
				arr[i]=arr[i-1]+arr[i-2];
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.printf("%d\n",arr[i]);
		}
		sc.close();
	}
}
