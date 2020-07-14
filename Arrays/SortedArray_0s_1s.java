package Arrays;

import java.util.Scanner;

public class SortedArray_0s_1s {

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
		int pos=0;
		int temp;
		for(int i=0;i<a.length;i++){
			
				if(a[i]==1){
					pos=i;
					break;
				}else{
					pos=-1;
					break;
				}
			}
		System.out.println(pos);
		
	}

}
