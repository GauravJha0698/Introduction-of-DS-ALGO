import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students: ");
int n=sc.nextInt();
int[] marks=new int[n];
System.out.println("Enter marks now: ");
for(int i=0;i<n;i++){
	
	marks[i]=sc.nextInt();
}
int average=0;
for(int i=0;i<n;i++){
	average += marks[i];
	
}
average/=n;
System.out.println("Avearge Marks : "+average);

	}

}
