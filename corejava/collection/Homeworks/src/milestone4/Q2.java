package milestone4;

public class Q2 {

	public static void main(String[] args) 
	{
		for(int i=0; i<10; i++ )
		{
			System.out.print("@");
		}
		System.out.println();
		for(int i=3; i>=0; i--)
		{
			if(i%2==0)
			{
				for(int k=0; k<=i; k++)
				{
					System.out.print("@");
				}
			}
			else
			{
				for(int m=0; m<=i; m++)
				{
					System.out.print("@");
				}
			}
		
		System.out.print(" ");
		for(int n=0; n<=i; n++)
		{
			System.out.print("@");
		}
		System.out.println();
	}
		
		
}
}
