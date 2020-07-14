package Arrays;

import java.util.Scanner;

public class Sum_Distinctelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			System.out.println("Enter the element: "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("Your array: ");
		sc.close();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<=n-1;i++){
			int distinct=a[i];
			for(int j=i+1;j<n;j++){
				if(distinct==a[j]){
					a[j]=0;
				}
				
			}
			sum+=distinct;
		}
		
		System.out.println("sum of distinct elements: "+sum);
	}

}
