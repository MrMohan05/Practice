package loops;

public class even_1_to_100 
{
	public static void main(String args[])
	{
		int i=1;
		System.out.println("using for loop:");
		for(;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}
		System.out.println("\nusing while loop:");
		i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
			i++;
		}
		System.out.println("\nusing do-while loop:");
		i=1;
		do
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
			i++;
		}while(i<=100);
	}
}
