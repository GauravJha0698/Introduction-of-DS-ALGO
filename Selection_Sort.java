import java.util.Scanner;

public class Selection_Sort {

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

		for(int i=0;i<n-1;i++){
			int minInd=i;
			for(int j=i;j<n;j++){
				if(a[j]<a[minInd]){
					minInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}

		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

}
