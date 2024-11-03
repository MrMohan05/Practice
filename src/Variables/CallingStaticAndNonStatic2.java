package Variables;

public class CallingStaticAndNonStatic2 
{
	public static void main(String args[])
	{
		System.out.println("a="+StaticAndNonStatic.a);
		
		StaticAndNonStatic SAN=new StaticAndNonStatic();
		
		System.out.println("b="+SAN.b);
		
	}
}