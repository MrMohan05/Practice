package FormulaQuestion;

public class Q4 {
	public static void main(String args[])
	{
		int sal=Integer.parseInt(args[0]);
		float hra=sal*0.15f;
		float cnv=sal*0.15f;
		float ent=sal*0.1f;
		float tsal=sal+hra+cnv+ent;
		System.out.println("sal="+sal+"\nhra="+hra+"\ncnv="+cnv+"\nent="+ent+"\nTotal sal="+tsal);
	}

}
