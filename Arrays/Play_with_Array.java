package Arrays;

public class Play_with_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={3,2,1,5,4};
int n=a.length;
int temp;
int f=0;
for(int j=n-1;j>=0;j--){
	if(j%2==0){
		for(int i=j-1;i>0;i--){
			if(i%2!=0 && a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	}
for(int j=0;j<n;j++){
	System.out.print(a[j]+" ");
}
for(int j=n-1;j>=0;j--){
	if(j%2==0){
		for(int i=j-1;i>0;i--){
			if(i%2!=0 && a[i]>a[j]){
			f=1;
			break;
			}
		}
	}
	}
System.out.println();
if(f==1){
	System.out.println(0);
}else
{
	System.out.println(1);
}
	}

}
