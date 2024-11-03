package loops;

public class sum_100_natural_num 
{
	public static void main(String args[])
	{
		int i,n;
		System.out.println("Using for loop");
		i=1;
		n=0;
		for(;i<=100;i++)
		{
			n+=i;
		}
		System.out.println("Sum="+n);
		System.out.println("Using while loop");
		i=1;
		n=0;
		while(i<=100)
		{
			n+=i;
			i++;
		}
		System.out.println("Sum="+n);
		System.out.println("Using do-while loop");
		i=1;
		n=0;
		do
		{
			n+=i;
			i++;
		}while(i<=100);
		System.out.println("Sum="+n);
	}
}
