package Arrays;

public class Inverse_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={2,3,4,5,1};
int n=a.length;
int temp;
int b[]=new int[n];
for(int i=0;i<a.length;i++){
b[a[i]-1]=i+1;

	}
for(int i=0;i<a.length;i++){
System.out.print(b[i]+" ");

	}

}
	
	}


