package Arrays;

import java.util.Scanner;

public class Sort_Specific {

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
		for(int i=0;i<a.length;i++){
					for(int j=i+1;j<a.length;j++){
						
					if(a[i]<a[j] && a[i]%2!=0){
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					if(a[i]>a[j] && a[i]%2==0){
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;	
					}
					}
					System.out.print(a[i]+" ");
					
			     	}
								
				}
	         }	