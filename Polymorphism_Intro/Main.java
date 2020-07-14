package Polymorphism_Intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
Pet p=d;
System.out.println(d.name);//Variables are never overrides.It can be hide.
System.out.println(p.name);//
Animal a=d;
d.walk();//RUN-TIME POLYMORPHISM:-It is also known as Dynamic Binding,Late Binding and overriding as well.It have slower execution.
p.walk();//
greetings("I love you",6);//COMPILE-TIME POLYMORPHISM:-It is also known as Static Binding,Early Binding and overloading as well.It have faster execution.
	}
	
public static void greetings(){
	System.out.println("hi,I'm there.");
}
public static void greetings(String s){
	System.out.println(s);
}
public static void greetings(String s,int count){
for(int i=0;i<count;i++ ){
	System.out.println(s);
}
}

}
