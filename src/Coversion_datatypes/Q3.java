package Coversion_datatypes;

public class Q3 
{
	public static void main(String args[])
	{
		int s=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[1]);
		int p,l;
		if(s>c)
		{
			p=s-c;
			System.out.println("Profit="+p);
		}
		else if(c>s)
		{
			l=c-s;
			System.out.println("Loss="+l);
		}
		else
		{
			System.out.println("No profit No loss");
		}
	}
}
