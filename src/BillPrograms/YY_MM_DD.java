package BillPrograms;

public class YY_MM_DD
{
	public static void main(String args[])
	{
		int days=Integer.parseInt(args[0]);
		int y=0,m=0;
		int m1;
		m1=days%365;
		y=days/365;
		m=m1/30;
		m1%=30;
		System.out.println("Yers="+y);
		System.out.println("Months="+m);
		System.out.println("Days="+m1);
	}
}
