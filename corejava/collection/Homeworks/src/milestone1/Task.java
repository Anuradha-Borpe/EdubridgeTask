package milestone1;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		int aniket[]=new int[3];
		int divya[]=new int[3];
		int AT=0, DS=0;
		Scanner sc=new Scanner(System.in);
		 for(int i=1; i<=3; i++)
		 {
			 aniket[i]=sc.nextInt();
			 divya[i]=sc.nextInt();
			 
			 if(aniket[i] > divya[i])
			 {
				AT++;
				System.out.println("Aniket got "+AT);
			 }
			 else if(divya[i]>aniket[i])
			 {
				 DS++;
				 System.out.println("Divya got "+DS);
			 }
			 else
			 {
				 System.out.println("not Score for Divya & Aniket");
			 }
			 
			 
		 }
}
}
