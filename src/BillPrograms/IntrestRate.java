package BillPrograms;

public class IntrestRate 
{
	public static void main(String args[])
	{
		int amt=Integer.parseInt(args[0]);
		float rate=Float.parseFloat(args[1]);
		float time=Float.parseFloat(args[2]);
		System.out.println("Amount:"+amt);
		System.out.println("Intrest Rate:"+rate);
		System.out.println("Time:"+time);
		float intrets=(amt*rate*time)/100;
		System.out.println("Intrest:"+intrets);
	}
}
