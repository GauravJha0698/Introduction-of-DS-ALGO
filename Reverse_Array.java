
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,2,3,4,5,6,7};
int n=a.length;

int temp;
for(int i=0,j=n-1;i<j;i++,j--){
	
		
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		
}
		for(int j=0;j<n;j++){
			System.out.println(a[j]);
		}

	
	}
}
