package Object_Oriented;

public class Methods_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNumber=1000;
int secondNumber=999;
int result=maxof(firstNumber,secondNumber);//METHOD CALLING

    
maxof(23,24);
maxof(35,40);
System.out.println(result);
say();
say();
	}
static int maxof(int a,int b){//METHOD CREATING
	if(a>b){
		return a;
	}else{
		return b;
	}
}
static void say(){
	System.out.println("HI GOODMORNING");
}
}
