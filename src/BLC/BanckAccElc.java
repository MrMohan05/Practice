package BLC;

public class BanckAccElc 
{
	public static void main(String args[])
	{
		BanckAcc b=new BanckAcc("Mohan",1234);
		b.deposite(5000);
		System.out.println(b.disp());
		b.deposite(10000);
		System.out.println(b.disp());	
		b.deposite(5000);
		System.out.println(b.disp());
		b.withdreaw(4000);
		System.out.println(b.disp());
		b.withdreaw(4000);
		System.out.println(b.disp());
	}
}
