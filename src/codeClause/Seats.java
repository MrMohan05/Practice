package codeClause;

public class Seats extends Movie
{
	int n[][]=new int[10][10];
	public void displaySeats()
	{
		System.out.println("  T S C R E E N   ");
		System.out.println("------------------\n");
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(n[i][j]==0)
				{
					System.out.print(" 0");
				}
				else
				{
					System.out.print(" 1");
				}			
			}
			System.out.println();
		}
	}
	public int setSeat(int r, int c,int ch)
	{
		if(n[r-1][c-1]==1)
		{
			System.out.println("Already Booked!!!");
			return --ch;
		}
		else
		{
		n[r-1][c-1]=1;
		return ch;
		}
	}
}
