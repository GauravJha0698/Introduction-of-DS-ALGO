package Arrays;

import java.util.Scanner;

public class Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the elements: "+(i+1));
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int temp=0;
		for(int i=0;i<n;i++){
			if(a[3]==a[4]){
				temp=a[3];
			}else if(a[4]==a[5]){
				temp=a[4];
			}else{
				temp=a[5];
			}
		}
		
			System.out.println(temp);
		
	}
}
