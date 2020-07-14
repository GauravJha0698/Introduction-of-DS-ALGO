import java.util.Scanner;

public class Prime_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		boolean isPrime=true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				isPrime=false;
				break;
			}
		}
		if(n<2)
			isPrime=false;
		System.out.println(isPrime);
		if(isPrime){
			while(temp>0){
			int lastdigit=temp%10;
			temp/=10;
			sum=sum+lastdigit;
			
		}
			System.out.println(sum);
			}
	}
	}


