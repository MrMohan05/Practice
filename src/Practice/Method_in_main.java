package Practice;

import java.util.Scanner;

public class Method_in_main 
{
	{
        System.out.println("Instance Initialization Block executed");
    }
    
    public Method_in_main(int n) {
        System.out.println("Constructor executed n="+n);
    }
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number:");
    	int n=sc.nextInt();
    	new Method_in_main(n);
    	sc.close();
    }
	
}