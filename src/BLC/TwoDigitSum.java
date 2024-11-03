package BLC;

public class TwoDigitSum 
{
	public static int getSumOfTwoDigit(int n)
	{
		int d=0,m=n;
		while(m!=0)
		{
			d+=m%10;
			m/=10;
		}
		return d;
	}
}
