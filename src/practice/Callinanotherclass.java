package practice;

public class Callinanotherclass 
{
	public static void main(String args[])
	{
		int s=Int.squre(Integer.parseInt(args[0]));
		System.out.println("Squre="+s);
	}
}
class Int
{
	public static int squre(int n)
	{
		return n*n;
	}
	public static int cube(int n)
	{
		return n*n*n;
	}
}