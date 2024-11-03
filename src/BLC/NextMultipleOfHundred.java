package BLC;

public class NextMultipleOfHundred 
{
	public static int getNextMultipleOfHundred(int n)
	{
		int r = 0,c=1;
		while(n>9)
		{
			r=n/10;
			c*=10;
			n/=10;
		}
		return (r+1)*c;
	}
}
