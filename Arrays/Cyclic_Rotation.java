package Arrays;

import java.util.Scanner;

public class Cyclic_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the d element: ");
		int d=sc.nextInt();
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++){
			System.out.println("Enter the elements: "+(i+1));
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0,j=n-1;i<j;i++,j--){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int i=d,j=n-1;i<j;i++,j--){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int j=0;j<n;j++){
			System.out.print(a[j]+" ");
		}
	}

}
