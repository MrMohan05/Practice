package Practice;

public class Switch
{
	public static void main(String args[])
	{
		String []s1= {"mohan","narayan","supekar"};
		for(String s:s1)
		{
		switch(s)
		{
		case "mohan":System.out.println("for each in mohan");break;
		case "narayan":System.out.println("for each in narayan");break;
		case "supekar":System.out.println("for each in supekar");break;
		//default : System.out.println("String not working");
		}
		//System.out.println("\n");
		}
	}
}
