package Calculations;

public class Total_Surface_Area {

	public static void main(String[] args) {
		final float pi=3.14f;
		int r=Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
		float ans=2*pi*r*(r+h);
		System.out.println("total surface area "+ans);
	}

}
