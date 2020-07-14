package Arrays;

import java.util.Scanner;

public class Zigzag_Array {

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
		int temp;
		
		 
		boolean flag=false;
		for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			
			
			if(!flag){
	
				if(a[i]>a[j]){
					
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				}else{
		
                 
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
				
				}
		}
		
				flag=!flag;
				
	}
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

	}
