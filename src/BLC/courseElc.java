package BLC;

public class courseElc 
{
	public static void main(String args[])
	{
		Course c=new Course();
		c.setCourseData("Batch39","Java FullStack",10, 27000);
		System.out.println(c.displayDetails());
	}
}
