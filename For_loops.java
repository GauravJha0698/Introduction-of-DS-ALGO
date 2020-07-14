import java.util.Scanner;
public class For_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int factorial=1;
for(int i=number;i>=1;i--){
	factorial=factorial*i;
}
System.out.println(factorial);
	}

}
