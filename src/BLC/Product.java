package BLC;

public class Product 
{
	private String pName;
	private int pId;
	private int pQut;
	private double price;
	public Product(int pId,String pName,int pQut,double price)
	{
		this.pId=pId;
		this.pName=pName;
		this.pQut=pQut;
		this.price=price;
	}
	public double calPrice()
	{
		return pQut*price;
	}
	public String disp()
	{
		return ("Product Id="+pId+" Product Name="+pName+" Product Quantity="+pQut+" Product price="+price);
	}
}
