package codeClause;

public class Movie
{
	int id[]={123,234,345,456,567};
	String name[]={"Movie 1","Movie 2","Movie 3","Movie 4","Movie 5"};
	String time[]= {"10:00 AM","12:00 PM","2:00 PM","4:00PM","6:00 PM"};
	public void displayMovie()
	{
		for(int i=0;i<name.length;i++)
		{
			System.out.println("ID : "+id[i]+" Name : "+name[i]+" ShowTime : "+time[i]);
		}
	}
	public void selectedMovie(int n)
	{
		System.out.println("Name of Movie : "+name[n-1]);
		System.out.println("ID of Movie : "+id[n-1]);
		System.out.println("Show Time : "+time[n-1]);
	}
}
