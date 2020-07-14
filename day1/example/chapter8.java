package day1.example;

public class chapter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={10,20,30,40,50};
System.out.println(a[2] +" " +a[4]);

//enhanced for:-
for(int temp:a)
{
	System.out.println(temp);
}



System.out.println("----------");




int[] x=new int[5];
x[3]=12;
x[0]=25;
for(int temp1:x)
{
	System.out.println(temp1);
}


System.out.println("------------");



String[] y=new String[5];
y[3]="GAURAV";
y[0]="ABDUL";
for(String temp2:y){
	System.out.println(temp2);
}

	}

}
