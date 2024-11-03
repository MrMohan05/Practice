package Practice;

public class Array 
{
	public static void main(String args[])
	{
		int[] a=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		for(int i=0;i<10;i++)
		{
			System.out.printf("%5d",a[i]);
		}
		int [] b= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(" ");
		for(int i=0;i<10;i++)
		{
			System.out.printf("%5d",b[i]);
		}
		int []c=new int [10];
		c[0]=Integer.parseInt(args[0]);
		c[1]=Integer.parseInt(args[1]);
		c[2]=Integer.parseInt(args[2]);
		c[3]=Integer.parseInt(args[3]);
		c[4]=Integer.parseInt(args[4]);
		c[5]=Integer.parseInt(args[5]);
		c[6]=Integer.parseInt(args[6]);
		c[7]=Integer.parseInt(args[7]);
		c[8]=Integer.parseInt(args[8]);
		c[9]=Integer.parseInt(args[9]);
		System.out.println(" ");
		for(int i=0;i<10;i++)
		{
			System.out.printf("%5d",c[i]);
		}
	}
}
