package Object_Oriented.Packages_Intro.Models;
//A java package is a group of similiar types of classes,interfaces and sub-packages.
//There are many built-in packages such as java,lang,awt,javax,swing,net,io,util,sql etc.




//ADVANTAGES OF PACKAGES:
//(1).Java package is used to categorize the classes and
//     interfaces so that they can be easily maintained.
//(2).Java package provides access protection.
//(3).Java package removes naming collision.

public class Student {
private String name;
public Student(String name){
	this.name=name;
}
public String getname(){
	return name;
}
}
