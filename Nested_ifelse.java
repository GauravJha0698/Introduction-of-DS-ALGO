import java.util.Scanner;

public class Nested_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
/*int number=sc.nextInt();
if(number>=1 && number<=100){
	System.out.println("Number lies between 1 to 100");
}
else{
	System.out.println("NOT EXIST");
}*/
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int result=0;
//Ternary Operator:-
result=a > b ? a > c ? a : c : b < c ? b : c;
//NESTED IF-ELSE:-
/*if(a>b){          
	if(a>c){
		result=a;
	}else{
		result=c;
	}
}else{
	
}if(b>c){
	result=b;
	
}else{
	result=c;
}*/
System.out.println("RESULT IS: "+result);
	}

}
