package Arrays;

import java.util.*;


public class ZeroSum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		boolean found=false;
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
//		for(int i=0;i<a.length;i++){
//			int sum=0;
//			for(int j=i;j<a.length;j++){
//				sum+=a[j];
//				if(sum==0){
//					found=true;
//					break;
//				}
//			}
//			if(found)break;
//		}
//		System.out.println("Found "+found);
		
		Set<Integer> set=new HashSet<>();
		int sum=0;
		int k=6;
		for(int element:a){
			set.add(sum);
			sum+=element;
			if(set.contains(sum-k)){
				found=true;
				break;
			}
		}
		System.out.println("Found "+found);
		
	}

}
