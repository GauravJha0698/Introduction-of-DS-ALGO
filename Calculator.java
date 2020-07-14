import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int result=0;
System.out.println("Enter the first number: ");
int a=sc.nextInt();
System.out.println("Enter the second number: ");
int b=sc.nextInt();
System.out.println("Enter the operation: ");
sc.nextLine();

char operation=sc.nextLine().charAt(0);
switch(operation){
case '+':
	result=a+b;
	System.out.println("RESULT is: "+result);
	break;
case '-':
	result=a-b;
	System.out.println("RESULT is: "+result);
	break;
case '*':
	result=a*b;
	System.out.println("RESULT is: "+result);
	break;
case '/':
	result=a/b;
	System.out.println("RESULT is: "+result);
	break;
	default:
		System.out.println("ERROR");
}
	}

}
