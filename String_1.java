import java.util.Scanner;

public class String_1 {
//It is non_primitive data type.It is immutable which doesnot change their values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//String n=sc.next();
		//String name="Gaurav";//For String Pool Area(By literals)
		//String name2=new String("Gaurav");//For Heap Area and a copy in Pool Area(By creating new object)
		
	//System.out.println(name.charAt(2));//for locate the position of char.
		
	
		//System.out.println(name.indexOf("G"));//To find the position of the given char.
		
		
//System.out.println(name.length());//To find the length of String.



//System.out.println(name.substring(1));//return the values after beginINDEX.


//System.out.println(name.substring(2, 4));//return the values between beginINDEX and endINDEX.
		
		

//System.out.println(name.contains("Abdul"));//it checks the correct values in String.
		
		
		
//System.out.println(name.toLowerCase());//To change in LowerCase.


//System.out.println(name.toUpperCase());//To change in UpperCase.
		

//System.out.println(name.trim());//To remove the spaces in String.
//System.out.println(name.equals(name2));//it checks the same or diff. values in String.

//System.out.println(name.isEmpty());//To check .is String empty?

//System.out.println(name.concat(name2));//To add the other String.

//System.out.println(name.replace('G', 'S'));//To replace the value in String.

//System.out.println(name.split("a"));//To return Array of String.

		
		
		       // EXAMPLE OF SPLIT FUNCTION
		
		String bikes="Hayabusa,Harley Davidson,Ninja,Bmw,KTM RC";
		String allbikes[]=bikes.split(",");
		for(String bike:allbikes){
			System.out.println(bike);
		}


	}

}
