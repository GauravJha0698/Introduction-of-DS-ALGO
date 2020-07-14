package Final_Keyword;

public class Student {//Final Class cannot be extended. 
final int ROLL_NO;//BLANK FINAL VARIABLE
final String name;

{
	ROLL_NO=4;
}
public Student(){
	name="Gaurav";
}
final public void getDescription(){//Final method cannot be override
	System.out.println("The Student name is Gaurav Jha");
}

}
