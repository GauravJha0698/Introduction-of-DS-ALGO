import java.util.Scanner;

public class Matrix_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter dimensions: ");
int rows=sc.nextInt();
int cols=sc.nextInt();
int a[][]=new int[rows][cols];
int b[][]=new int[rows][cols];
System.out.println("Enter matrix a: ");
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		 a[i][j]=sc.nextInt();
	}
}
System.out.println("Enter matrix b: ");
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		 b[i][j]=sc.nextInt();
	}
}
int c[][]=new int[rows][cols];
System.out.println("ADDITION OF TWO ARRAYS: ");
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		 c[i][j]=a[i][j]+b[i][j];
	}
	
}
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		 System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
	}

}
