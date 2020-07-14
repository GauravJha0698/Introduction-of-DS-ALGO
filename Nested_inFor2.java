import java.util.Scanner;

public class Nested_inFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++){
	for(int j=1;j<=10;j++){
		int tableOf=i;
		System.out.print(tableOf*j+" ");
	}
	System.out.println();
}
	}

}
