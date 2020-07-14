package Object_Oriented;
//Static keyword indicates that the particular member belongs to a type itself,rather than to an instance of that type.
//It is mainly used to help memory management.
//The keyword can be applied to variables,methods,blocks and nested class.
public class Static_Keyword {
static class Persons{
	static int age;
	String name;
	static String breed ="Homosapiens";
	
	public static int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void setAge(int age) {
		if(age>100){
			System.out.println("Not Homosapiens");
		}else{
		Persons.age = age;
		System.out.println("Homosapiens");
	}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persons ob=new Persons();
ob.setName("Gaurav");
System.out.println(ob.getName());
ob.setAge(20);
System.out.println(ob.getAge());
	}

}
