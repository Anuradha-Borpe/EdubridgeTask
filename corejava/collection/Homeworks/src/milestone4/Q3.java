package milestone4;
import java.util.Scanner;


public class Q3 {

	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int rows;
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter a number of rows");
       rows=sc.nextInt();
       char alph=64;;
       
       
       for(int i=1; i<=rows; i++)
       {
    	   int k=i;
    	   for(int j=1; j<=i; j++)
    	   {
    		   System.out.print((char)(alph+k));
    		   k++;
    		   
    	   }
    	   System.out.println();
    	 
       }
	}

}
