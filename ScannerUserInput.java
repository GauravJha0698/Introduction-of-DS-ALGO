import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int length=sc.nextInt();
System.out.println("Enter the length:"+length);
int width=sc.nextInt();
System.out.println("Enter the width:"+width);
int area=length*width;
System.out.println("Your area is:"+area);
	}

}
