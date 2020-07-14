import java.util.Scanner;

public class Palindrome_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int reverse=0;
while(temp>0){
	int lastdigit=temp%10;
	temp /=10;
	reverse=reverse*10+lastdigit;
	
}
	if(reverse==n){
		System.out.println(n + " is Palindrome");
	}else{
		System.out.println(n + " is not Palindrome");
	}

	}

}
