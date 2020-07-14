package Arrays;

import java.util.Scanner;

public class Maxmin {

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
		int maxind=a[0];
		int minind=a[0];
		for(int i=1;i<n;i++){
			
			
			
				if(maxind<a[i]){
					maxind=a[i];
				}
				if(minind>a[i]){
					minind=a[i];
				}
						
		}
	System.out.println("maxvalue: "+maxind);
	System.out.println("minvalue: "+minind);	
		
		
	}

}
