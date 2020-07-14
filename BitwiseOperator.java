import java.util.*;
public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=13;  // For right shift of b:b >> 1
//int c = a | b; //For OR gate
//int c= a & b;// For AND gate
int c=b<<1;//For left shift of b is multiply of b
a >>= 2; //Assignment Operator
System.out.println(c);
System.out.println(a);
System.out.println(a>b);//comparision operator

	}

}
