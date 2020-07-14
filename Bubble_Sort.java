import java.util.*;


public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array: ");
int n=sc.nextInt();
int a[]=new int[n];
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
Arrays.sort(a);
//for(int i=0;i<n-1;i++){
//	for(int j=i+1;j<n;j++){
//		if(a[j]<a[i]){
//			int temp=a[j];
//			a[j]=a[i];
//			a[i]=temp;
//		}
//	}
//}


for(int i=0;i<n;i++){
	System.out.print(a[i]+" ");
}
	}
	}

