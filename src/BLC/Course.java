package BLC;

public class Course 
{
	private String courseId;
	private String courseName;
	private int courseTime;
	private double fees;
	
	public void setCourseData(String courseId,String courseName,int courseTime,double fees)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseTime=courseTime;
		this.fees=fees;
	}
	public String displayDetails()
	{
		return ("Coure ID="+courseId+"\nCourseName="+courseName+"\nCourse Time="+courseTime+"\nFees="+fees);
	}
}
