package IfElse;

public class Next_Multiple_of_100 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		if(n>0)
		{
			int r=1;
			while(n>10)
			{
				n/=10;
				r++;
			}
			n+=1;
			if(r>2 && r<4)
			System.out.println(n*100);
			else
			System.out.println("100");
		}
	}
}
