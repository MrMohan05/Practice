package Variables;

public class StaticAndNonStatic 
{
    public static int a = 10; 
    public int b = 20;   
    
    public static void main(String args[])
    {
    	System.out.println("a="+a);
    	
    	StaticAndNonStatic SAN=new StaticAndNonStatic();
    	
    	System.out.println("b="+SAN.b);
    }
}
