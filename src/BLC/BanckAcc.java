package BLC;

public class BanckAcc 
{
	private long accNo;
	private String accHolderName;
	private double bal;
	
	public BanckAcc(String accHolderName,long accNo)
	{
		this.accHolderName=accHolderName;
		this.accNo=accNo;
	}
	
	public void deposite(double amt)
	{
		bal+=amt;
	}
	
	public void withdreaw(double amt)
	{
		bal-=amt;
	}
	
	public String disp()
	{
		return ("Acc no="+accNo+" Acc Name="+accHolderName+" Balance="+bal);
	}
}
