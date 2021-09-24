package milestone1;
import java.util.Scanner;

public class Alphabet {

	private static Scanner sc;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch;
		sc = new Scanner(System.in);
		System.out.println("Enter the DIGIT or ALPHABET");
		ch=sc.next().charAt(0);
		if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("It is a Alphabet"+" "+ch);
		}
		else if((ch>='0' && ch<='9')) 
				{
			System.out.println("It is a DIGIT"+ ""+ch);
				}
		else
		{
			System.out.println("It is neither DIGIT or nor a ALPHABET");
		}
		
		

	}

}
