package BLC;

public class BankBlc 
{
	final static String BankName="Union Bank Of India";
	final static String Bankadd="Gangapur Road";
	final static String BankIFSC="UBINO4562";
	final static int BankFixedAmt=500;
	private String CusName;
	private long CusMobNO;
	private long AccNo;
	private double bal=500;
	public void setCustomerData(String CusName,long CusMobNO,long AccNo)
	{
		this.AccNo=AccNo;
		this.CusMobNO=CusMobNO;
		this.CusName=CusName;
	}

	public String DispCus() 
	{
		System.out.println("\n------------------Customer Deatils--------------");
		return "CusName=" + CusName + "\nCusMobNO=" + CusMobNO + "\nAccNo=" + AccNo;
	}
	public String DispBank()
	{
		System.out.println("------------------Bank Deatils------------------");
		return "BankName="+BankName+" \nBankadd="+Bankadd+" \nBankIFSC="+BankIFSC+" \nBankFixedAmt="+BankFixedAmt;
	}
	
	public void Withdraw(double amt)
	{
		if(amt<0 || bal<amt)
		{
			System.out.println("Amount should be greater than 0");
		}
		else
		{
			System.out.println("\nAmount withdraw="+amt);
			 bal=bal-amt;
		}
	}
	public void Deposite(double amt)
	{
		if(amt<0)
		{
			System.out.println("Amount should be greater than 0");
		}
		else
		{
			System.out.println("\nAmount deposited="+amt);
			bal=bal+amt;
		}	
	}
	public void dispbal()
	{
		System.out.println("bal="+bal);
	}
}
