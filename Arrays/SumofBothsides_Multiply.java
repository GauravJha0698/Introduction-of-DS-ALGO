package Arrays;

import java.util.Scanner;

public class SumofBothsides_Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			System.out.println("Enter the element: "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("Your array: ");
		sc.close();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();

			 
			for(int i=0;i<n/2;i++){
				 sum1=sum1+a[i];
				
				
			}
			System.out.println("SUM1: "+sum1);
			for(int j=n/2;j<n;j++){
				sum2=sum2+a[j];
			}
			System.out.println("SUM2: "+sum2);
			int multi=sum1*sum2;
			System.out.println("Multiplication of both sides: "+multi);
	}

}
