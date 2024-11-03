package ELC;
import java.util.*;
import BLC.NextMultipleOfHundred;
public class Next100MultipleELC 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int n=sc.nextInt();
	int multiple=NextMultipleOfHundred.getNextMultipleOfHundred(n);
	System.out.println("Next multiple of "+n+" is "+multiple);
	sc.close();
}
}
