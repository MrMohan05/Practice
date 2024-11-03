package Coversion_datatypes;

public class Q1 {
	public static void main(String args[])
	{
		float a=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]);
		float c=a*b;
		System.out.println("Float c="+c);
		
		double d=Double.parseDouble(args[2]);
		System.out.println("Double d="+d);
	}

}
