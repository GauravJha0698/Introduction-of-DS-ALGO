package Arrays;

import java.util.Scanner;

public class Repeated_Digit {

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
int k=1;
System.out.println();
for(int i=0;i<n;i++){
int temp=a[i];
while(temp>0){
int lastdigit=temp%10;
temp/=10;

if(lastdigit==k){
k++;	
}
}
if(temp==k){
	k++;
}
}

	System.out.println(k);


	}

}
