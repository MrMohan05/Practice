package BLC;

public class TwoDigitsDifference 
{
	public static int getDiffOfDigits(int n)
	{
		int d,r;
		r=n%10;
		d=n/10;
		return (d-r);
	}
}
