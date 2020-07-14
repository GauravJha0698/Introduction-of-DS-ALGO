package Arrays;

import java.util.Scanner;

public class Pendulam_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		int temp;
		for(int i=0;i<n;i++){
			System.out.println("Enter the elements: "+(i+1));
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int min=0;
		int mid=(n-1)/2;
		for(int j=1;j<a.length;j++){
			
			
				if(a[min]>a[j]){
					a[min]=a[j];
				}
			
		}
		temp=b[mid];
		b[mid]=a[min];
		a[min]=temp;
		int j=1,i=1;
		for( i=1;i<=mid;i++){
			b[mid+i]=a[j++];
			b[mid-i]=a[j++];
		}
		
		if(i%2==0)
		{
		b[mid+i]=a[j];	
		}
		

		
		
		for( i=0;i<n;i++){
			System.out.print(b[i]+" ");
		}
	}

}
