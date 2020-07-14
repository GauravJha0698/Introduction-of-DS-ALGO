package Object_Oriented;

import Object_Oriented.Packages_Intro.Models.Main.Person;
import Object_Oriented.Packages_Intro.Models.Main.Singer;
import Object_Oriented.Packages_Intro.Models.Main.Teacher;

public class Casting {
//Implicit Casting or Up Casting.
//Explicit Casting or Down Casting.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Teacher t=new Teacher();
//Person p=t;//Implicit
		Teacher t1=new Teacher("Gaurav");
		Singer s1=new Singer("abdul");
		
Person p=t1;
Teacher t=(Teacher)p;//Explicit
boolean y=t1 instanceof Teacher;
System.out.println(t1 instanceof Teacher);
System.out.println(s1 instanceof Singer);
System.out.println(t1 instanceof Person);
System.out.println(t instanceof Person);
System.out.println(p instanceof Singer);
	}

}
