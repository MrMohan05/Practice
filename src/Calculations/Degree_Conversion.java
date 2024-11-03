package Calculations;

public class Degree_Conversion {
	public static void main(String args[])
	{
		int d=Integer.parseInt(args[0]);
		float f=(d-32)*(5/9.0f);
		System.out.println("In Celsius="+f);
		float c=((d*9)/5.0f)+32;
		System.out.println("In Fahrenheit="+c);
	}

}
