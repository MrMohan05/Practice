package BillPrograms;

public class TVSelling 
{
	public static void main(String arsg[])
	{
		int price=32500;
		float sellprice=(price*0.27f)+price;
		float vat=(sellprice*0.127f);
		float servicecharge=sellprice*0.0387f;
		float total=sellprice+vat+servicecharge;
		System.out.println("-----------------TV Bill--------------------");
		System.out.println("Charges                               Amount");
		System.out.printf("selling price with profit:             %.2f",sellprice);
		System.out.printf("\nvat:                                 %.2f",vat);
		System.out.printf("\nServicecharges:                      %.2f",servicecharge);
		System.out.printf("\nTotal=                               %.2f",total);
	}
}
