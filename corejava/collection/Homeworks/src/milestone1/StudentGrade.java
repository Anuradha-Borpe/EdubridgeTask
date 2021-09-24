package milestone1;
import java.util.Scanner;

public class StudentGrade
{

	private static Scanner sc;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int mathematics, chemistry, biology, physics, computer; 
	    float total, per, avg;
		 sc = new Scanner(System.in);
		
		System.out.print("Enter the Five Subjects Marks: ");
		mathematics = sc.nextInt();	
		chemistry = sc.nextInt();	
		biology = sc.nextInt();	
		physics = sc.nextInt();	
		computer = sc.nextInt();	
		
		total = mathematics + chemistry + biology + physics + computer;
		avg = total / 5;
	    per = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + avg);
	    System.out.println(" Marks Per =  " + per);
	    if(per>=90)
	    {
	    	System.out.println("HE/She got A grade");
	    }
	    else if(per>=80)
	    {
	    	System.out.println("HE/SHE got B grade");
	    }
	    else if(per>=70)
	    {
	    	System.out.println("HE/SHE got C grade");
	    }
	    else if(per>=60)
	    	{
	          System.out.println("HE/SHE got D grade");		
	    	}
	    else if(per>40)
	    {
	    	System.out.println("HE/SHE got E grade");
	    }
	    else
	    {
	    	System.out.println("HE/SHE got F grade");
	    }
	    }
	}


	


