package ABSTRACTIONS;

public abstract class Cars {//A Class that is declared using "abstract"
	                        //keyword is known as abstract class.
	
	public abstract void accelerate();//ABSTRACT METHODS(without body)
	public abstract void breaking();//
	public void honk(){
		System.out.println("Car is honking.");//CONCRETE METHODS(with body)
	}
}
//An abstract class cannot be instantiated,which means you
//are not allowed to create an object of it.


//An abstract class must be extended and in a same way abstract method must be overriden.