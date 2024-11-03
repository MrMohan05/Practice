package BillPrograms;

public class Incentive 
{
	public static void main(String args[])
	{
		int bill=Integer.parseInt(args[0]);
		float dis;
		if(bill>=10000)
		{
			dis=bill-(bill*0.15f);
		}
		else if(bill>=5000 && bill<1000f)
		{
			dis=bill-(bill*0.1f);
		}
		else
		{
			dis=bill-(bill*0.05f);
		}
		System.out.println("After discount="+dis);
	}
}
