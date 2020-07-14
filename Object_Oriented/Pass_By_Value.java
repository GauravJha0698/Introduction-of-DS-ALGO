package Object_Oriented;
//PassByValue:-The method parameter value is copied by another variable and then the copied object is passed.
//Java pass is passbyvalue.
//PassByReference:-A reference to the actual parameter is passed to the method.
public class Pass_By_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=12;
int d=22;
swap(c,d);
System.out.println(c+" "+d);

Dog a=new Dog();
a.legs=4;
changeDog(a);
System.out.println(a.legs);
	}
static void swap(int a,int b){
	int temp=a;
	a=b;
	b=temp;
}
static void changeDog(Dog dog){
	dog.legs=6;
}

}
class Dog{
	int legs;
}
