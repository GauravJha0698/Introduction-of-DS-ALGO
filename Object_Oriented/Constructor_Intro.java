package Object_Oriented;
//A constructor is similiar to a method(but not actually a method) 
//   that is invoked automatically when an object is instantiated.
class Bike{
	int power;
	int speed;
	String color;
	
	Bike(int powerOf){    //parametrized constructor
		this.power=powerOf;//THIS KEYWORD
	speed=240;	
	}
	Bike(){
		//This is DEFAULT CONSTRUCTOR.It is only containing 0 as a result.
	}
	//CONSTRUCTOR OVERLOADING:-It is same in the constructor name but different in parameters.
	Bike(int power,String color){
		this.color=color;
		this.power=power;
		speed=240;
	}
}


class Vehicle{
	int wheels;
	Vehicle(){
		wheels=4;
	}
}



public class Constructor_Intro {
Constructor_Intro(){//This is now constructor(No-Arg Constructor).
	System.out.println("My name is Gaurav Jha");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Constructor_Intro obj=new Constructor_Intro();
//Vehicle car=new Vehicle();
//System.out.println(car.wheels);
		Bike Hayabusa=new Bike(1300);
		Bike Hyosung=new Bike(690);
		Bike Ninja=new Bike(990,"Green Ninja");
		System.out.println(Hayabusa.power+" "+Hayabusa.speed);
		System.out.println(Hyosung.power+" "+Hyosung.speed);
		System.out.println(Ninja.color+" "+Ninja.power+" "+Ninja.speed);
	}

}
//No-Arg Constructor:-If a java constructor does not accept any parameters.