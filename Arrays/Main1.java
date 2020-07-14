package Arrays;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int k=0;k<n;k++){
			//System.out.println("Enter the elements: "+(k+1));
			a[k]=sc.nextInt();
		}
		sc.close();
		System.out.println("Array is: ");
		for(int k=0;k<n;k++){
			
			System.out.print(a[k]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++){
Triplets_sum t=new Triplets_sum();
if(t.triplets(a, n)){
	System.out.print("1");
}else{
	System.out.print("0");
}
		}
	}

}
