package codeClause;

import java.util.Scanner;

public class BookTicket 
{
	public static void main(String[] args) 
	{
		Seats s=new Seats();
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch!=0)
		{
		System.out.print("Choose 0 to exit:");
		ch=sc.nextInt();
		s.displayMovie();
		System.out.print("Enter your choice : ");
		int n=sc.nextInt();
		s.selectedMovie(n);
		System.out.println("Enter how many tickets you want:");
		int t;
		t=sc.nextInt();
		s.displaySeats();
		for(int i=0;i<t;i++)
		{
		System.out.println("Select your seat number:");
		int r,c;
		System.out.print("Enter row number :");
		r=sc.nextInt();
		System.out.print("Enter column number :");
		c=sc.nextInt();
		i=s.setSeat(r, c,i);
		s.displaySeats();
		}
		}
		
		
		
		sc.close();
		
	}
}
