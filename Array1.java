import java.util.Scanner;
//import java.io.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//System.out.println("What are the size of array:- ");
int s=sc.nextInt();
int ob[]=new int[s];
//System.out.println("Array length "+ob.length);
//System.out.println("Enter"+s+"Elements");
for(int i=0;i<ob.length;i++)
{
	System.out.println("Enter the elements:"+(i+1));
	ob[i]=sc.nextInt();
}
sc.close();
System.out.println("Your array :- ");
for(int i=0;i<ob.length;i++)
{
	System.out.println(ob[i]);
}
	}

}
