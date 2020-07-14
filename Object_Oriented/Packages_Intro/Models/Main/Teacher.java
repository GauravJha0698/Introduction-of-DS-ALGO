package Object_Oriented.Packages_Intro.Models.Main;



public class Teacher extends Person {
public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
public void walk(){
	super.walk();
	System.out.println("Teacher is walking");
}
public void teach(){
	
	System.out.println(name+" is teaching");
}
public void eat(){
	super.eat();
	System.out.println("Teacher is eating");
}
	

}
