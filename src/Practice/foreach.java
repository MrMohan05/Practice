package Practice;

public class foreach 
{
	public static void main(String args[])
	{
		String str= "mohan";
		String rev="";
		for(char s:str.toCharArray())
		{
		System.out.print(s);
		rev=s+rev;
		}
		System.out.println("\n"+rev);
	}
}
