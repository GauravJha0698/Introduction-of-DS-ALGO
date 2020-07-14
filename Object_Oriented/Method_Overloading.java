package Object_Oriented;
//When a class has two or more methods with same name but different parameters.
//
//METHOD OVERRIDING:-In this case,the method in the subclass overrides the method in the superclass.
public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum(1,2,5);
sum(1,2);
	}
	static void sum(int a,int b,float c ){
		c=a+b;
	}
	static void sum(int a,int b){
		System.out.println(a);
	}
	static int sum(float a,float b,float c ){
		c=a+b;
		return 0;
	}
}
