package Object_Oriented;
//Inheritance is an is-a relationship.we use inheritance only if an is-a relationship is present between the two classes.

import Object_Oriented.Packages_Intro.Models.Main.Teacher;

public class Inheritance_Intro  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher("Gaurav");
		t.name="Gaurav";
		t.eat();
		t.walk();
		t.teach();
		t.laughing();
	}

}
