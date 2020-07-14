package day1.example;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double salary=10000;
double tax=0.0;
if(salary<=15000)
{
	tax=salary *.1;
}
else if(salary>15000 && salary<=40000){
	tax=salary *.2;
}
else{
	tax=salary*.3;
}
System.out.println("Tax= "+tax);

	}
}
