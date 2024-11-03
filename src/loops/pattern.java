package loops;

public class pattern 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<6;i++)
		{	
			for(int j=1;j<6;j++)
			{
				if(i==1)
				System.out.print(j+" ");
				else
					if(j>=i)
						System.out.print(n-(j-i)+" ");//4==>4 3 2 1 3==>3 2 1 2==>2 1
					else						     //    2 3 4 5     3 4 5     4 5
					System.out.print("  ");			 //    2           3         4
			}
			n--;
			System.out.print("\n");
		}
	}
}
