package loops;
import java.util.*;


public class Table_of_given_number 
{
	public static void main(String args[])
	{
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number to generate table:");
			int n=sc.nextInt();
			int i;
			System.out.println("Using for loop");
			i=1;
			for(;i<=10;i++)
			{
				System.out.println(i*n);
			}
			System.out.println("Using while loop");
			i=1;
			while(i<=10)
			{
				System.out.println(i*n);
				i++;
			}
			System.out.println("Using do while loop");
			i=1;
			do
			{
				System.out.println(i*n);
				i++;
			}while(i<=10);
		}
	}
}

