package Object_Oriented.Packages_Intro.Models.Main;

public class Person {
 public static String name;
 public Person(String name){
	 this.name=name;
	 System.out.println("person constructor");
 }
protected void walk(){
	
	System.out.println(name+ " is walking");
}
public void eat(){
	System.out.println(name+ " is eating");
}
public static void laughing(){
	System.out.println(name+ " is laughing ");
}
}
