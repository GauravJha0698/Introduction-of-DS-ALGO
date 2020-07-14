package Arrays;

import java.util.Scanner;

public class Rightside_Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

			
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array: ");
				int n=sc.nextInt();
				int a[]=new int[n];
				
				int temp;
				for(int k=0;k<n;k++){
					System.out.println("Enter the elements: "+(k+1));
					a[k]=sc.nextInt();
				}
				sc.close();
				System.out.println("Array is: ");
				for(int k=0;k<n;k++){
					System.out.print(a[k]+" ");
				}
				System.out.println();

				for(int i=0;i<n-1;i++){
					int max=0;
					for(int j=i+1;j<n;j++){
						
					
					if(max<a[j]){
						max=a[j];
						
					}
				}
					a[i]=max;
				}
				a[n-1]=-1;
				for(int i=0;i<a.length;i++){
					
					System.out.print(a[i]+" ");
				}
			}

		

	}


