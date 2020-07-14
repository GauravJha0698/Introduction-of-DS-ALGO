package Object_Oriented;

public class Student_Encapsulation {

	private String name;
	private int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks<30){
			System.out.println("Not eligible for filling the form");
		}else{
		this.marks = marks;
		System.out.println("Eligible for filling the form");
	}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
		
	}
}

