import java.util.Scanner;

public class MatrixMul_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter dimensions of first matrix : ");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter dimensions of second matrix : ");
int m=sc.nextInt();
int n=sc.nextInt();
int result[][]=new int[10][10];
if(b!=m){
	System.out.println("Matrix multiplication not possible");
}else{
	System.out.println("Matrix multiplication possible");
	System.out.println("Enter elements of first matrix:");
	int first[][]=new int[10][10];
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
			first[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter elements of second matrix:");
	int second[][]=new int[10][10];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			second[i][j]=sc.nextInt();
		}
	}
	System.out.println("Matrix Multiplication is: ");
	int res=0;
	for(int i=0;i<a;i++){
		for(int j=0;j<n;j++){
			for(int k=0;k<m;k++){
				res+=first[i][k]*second[k][j];
				
			}
			result[i][j]=res;
			res=0;
		}
	}
	for(int i=0;i<a;i++){
		for(int j=0;j<n;j++){
	System.out.print(result[i][j]+" ");		
		}
		System.out.println();
	}


	
}
	}

}
