package BLC;

public class ProductElc 
{
	public static void main(String args[])
	{
		Product p=new Product(101,"Range Rover",5,50000);
		System.out.println("Product total price="+p.calPrice());
		System.out.println("Details of product is as follows\n"+p.disp());
	}
}
