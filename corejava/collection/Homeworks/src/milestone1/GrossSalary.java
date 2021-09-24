package milestone1;
import java.util.Scanner;

public class GrossSalary {

	private static Scanner sc;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		float basic_Salary;
		float DA;
		float HRA;
		float gross_Salary;
		 sc = new Scanner(System.in);
		 System.out.println("Enter basic salary:");
		 basic_Salary =sc.nextFloat();
		 // find DA & HRA Accordingly
		 if(basic_Salary<=10000)
		 {
			 DA= (basic_Salary * 80)/100;
			 HRA= (basic_Salary * 20)/100;
			 System.out.println("He got DA with rupees="+DA);
			 System.out.println("He got HRA with rupees="+HRA);
			 
			 
		 }
		 else if(basic_Salary<=20000)
		 {
			 DA= (basic_Salary * 90)/100;
			 HRA= (basic_Salary * 25)/100;
		  System.out.println("He got DA with rupees="+DA);
			 System.out.println("He got HRA with rupees="+HRA);
		 }
		 else 
		 {
			 DA= (basic_Salary * 95)/100;
			 HRA= (basic_Salary * 30)/100; 
			 System.out.println("He got DA with rupees="+DA);
			 System.out.println("He got HRA with rupees="+HRA);
		
		 }	
		 //  Calculation of Gross Salary
		 gross_Salary= basic_Salary + DA + HRA;
		 System.out.println("Gross Salary is ="+gross_Salary);
	}

}
