package FormulaQuestion;

public class Q2 {
public static void main(String args[])
{
	int n=Integer.parseInt(args[0]);
	int r,m=n,n1=0;
	while(m!=0)
	{
		r=m%10;
		m/=10;
		n1=(n1*10)+r;
		r=0;
	}
	System.out.println("Reverse number="+n1);
	if(n==n1)
	{
		System.out.println("Number is palindrom:");
	}
	else
	{
		System.out.println("Number is not a palindron:");
	}
}
}
