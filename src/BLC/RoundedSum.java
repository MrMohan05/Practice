package BLC;

public class RoundedSum 
{
	public static int sumOfRoundedValues(int n,int m,int o)
	{
		int []a= {n,m,o};
		int sum=0;
		for(int i:a)
		{
			int r=i%10;
			if(r<5)
			{
				i=i/10*10;
			}
			else
			{
				i=((i/10)+1)*10;
			}
			sum+=i;
			System.out.println("Rounded number="+i);
		}
		return sum;
	}
}
