package milestone1;

import java.util.Scanner;

public class FullSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int array1[]=new int[N];
		String array2[]=new String[N];
		
		for(int i=0;i<N;i++) {
			int a=sc.nextInt();
			String b=sc.next();
			
			if(i<N/2) {
				array1[i]=a;
				array2[i]="-";	
			}else {
				array1[i]=a;
				array2[i]=b;
			}
			for( i=0;i<N;i++) {
				for(int j=1;j<(N-i);j++) {
					if(array1[j-1]>array1[j]) {
						int t=array1[j-1];
						array1[j-1]=array1[j];
						array1[j]=t;
						
						String t1=array2[j-1];
						array2[j-1]=array2[j];
						array2[j]=t1;
						
					}
				}
			}
			
			for( i=0;i<N;i++) {
				System.out.print(array2[i]+" ");
			}
			
		}
		  
}
}