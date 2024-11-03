package FormulaQuestion;

public class Q1 {
	public static void main(String args[])
	{
		int camt=Integer.parseInt(args[0]);
		int cprice=Integer.parseInt(args[1]);
		int vamt=Integer.parseInt(args[2]);
		int vprice=Integer.parseInt(args[3]);
		System.out.println("				Dominose Bill");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Item		|	Qyt		|	Price 		|	Total");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Chiken rolls	|	"+camt+"		|         "+cprice+"		| 	"+(camt*cprice));
		System.out.println("vegetable puffs	|	"+vamt+"		|	 "+camt+"		|	"+(vamt*vprice));
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Total bill befor discount |                                     |        "+((camt*cprice)+(vamt*vprice)));
		System.out.println("Total after discount      |                                     |        "+((camt*cprice)+(vamt*vprice)-50));
	}

}
