package Variables2;

import Variables.StaticAndNonStatic;

public class CallingStaticAndNonStatic 
{
    public static void main(String[] args) 
    {
    	
        System.out.println("Static variable a: " + StaticAndNonStatic.a);
        
        StaticAndNonStatic obj = new StaticAndNonStatic();
        
        System.out.println("Non-static variable b: " + obj.b);
    }
}
