package milestone1;
import java.util.Scanner;

public class Year {

	private static Scanner sc;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int year;
		sc = new Scanner (System.in);
		System.out.println("enter a year");
		year=sc.nextInt();
		if((year % 4==0 && year%100!=0)|| year%400==0)
		{
			System.out.println(year+"is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
			
	}

}
