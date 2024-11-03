package BillPrograms;

public class CycleSelling 
{
	public static void main(String args[])
	{
		int purchasedp=1200;
		int repair=250;
		int colouring=350;
		int newa=500;
		float totalexp=purchasedp+repair+colouring+newa;
		float selling=totalexp+1500f;
		System.out.println("----------------Cycle price------------------");
		System.out.println("Expence                                 price");
		System.out.println("purche price                            "+purchasedp);
		System.out.println("Repair                                  "+repair);
		System.out.println("Coloring                                "+colouring);
		System.out.println("New accessories                         "+newa);
		System.out.println("Total Expense                           "+totalexp);
		System.out.println("Selling price                           "+selling);
	}
}
