package milestone1;
import java.util.Scanner;

public class Salary {

	private static Scanner reader;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double basicSalary;
		double DA;
		double HRA;
		double grossSalary;
		reader = new Scanner(System.in);
				System.out.println("enter the basic salary:");
		  basicSalary = reader.nextDouble();
		
		DA=(basicSalary * 20)/100;
		HRA=(basicSalary * 80)/100;
		grossSalary=basicSalary + DA + HRA;
		
		System.out.println("Value of="+DA);
		System.out.println("Value of ="+HRA);
		System.out.println("Gross Salary="+grossSalary);
		
		
		

	}

}
