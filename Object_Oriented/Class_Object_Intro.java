package Object_Oriented;
//JAVA is object_oriented programming language because it is connected to our real_world.


	class students{          //this is our class.
		boolean present;
		String names,adress,grades;
		int section,roll;
		public void grade(){
		System.out.println("Student name is "+names+".It has Roll no.: "+roll+".Section: "+section+".Grade is: "+grades);
			
		}
		
	}
public class Class_Object_Intro {
	
	
		//Only one public class in a java file.
	//object is defined by the instance of class.
		//class is the blueprint of object.
		//object have its own states and behaviours(properties).
		public static void main(String[] args) {
			students s1=new students();//object create under main class.
		students s2=new students();	
		s1.names="Gaurav";
		s2.names="Abdul";
		s1.present=true;
		s2.present=false;
		s1.roll=40;
		s2.roll=51;
		s1.section=4;
		s2.section=5;
		s1.grades="A";
		s2.grades="B+";
		
		
		s1.grade();
		s2.grade();
		}

	}


