package Calculations;

public class Compound_Intrest {
	public static void main(String args[])
	{
		int p=Integer.parseInt(args[0]);
		float r=Float.parseFloat(args[1]);
		float amt=p*((1+r/100)*(1+r/100)*(1+r/100));
		System.out.println("Compound_Intrest="+amt);
	}
}
