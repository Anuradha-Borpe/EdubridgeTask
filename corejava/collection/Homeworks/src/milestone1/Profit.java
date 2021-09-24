package milestone1;

public class Profit {
	public static void main(String[] args) {


		float exp=5000;
		
		for(int i=2016;i<=2025;i++)
		{
			if(i<=2020)
			{
				exp=exp+exp*(10)/100;
				
				System.out.println("Expenses in year "+i+ "is :"+exp);
			}
			else if(i==2021)
			{
				
				exp=exp+exp*(10)/100;
				exp=exp+4000;
				
				
                System.out.println("Expenses in year "+i+ "is :"+exp);
			}
			
			else
			{
                exp=exp+exp*(10)/100;
				
				System.out.println("Expenses in year "+i+ "is :"+exp);
			}
			
		}

	}
}
