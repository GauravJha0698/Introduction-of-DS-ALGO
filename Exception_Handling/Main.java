package Exception_Handling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//int a=4;
//int b=0;
//int c=a/b;
//System.out.println(c);
			int a[]=new int [5];
			System.out.println(a[6]);
	}catch(ArithmeticException e){
		System.out.println(e.getMessage() +" occured,PLEASE check your code");
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index should be in the range of 0 to size of array");
		}
		catch(IllegalArgumentException e){
			System.out.println("Check your casting carefully");
		}finally{//Run with catch block or without catch block.
			System.out.println("Sorry for the inconvenience");
		}
		
		System.out.println("Very Important code which will be need to run");
		func1();
	}
	
	static void func1(){
		int x=5;
		int y=4;
		int z=x/y;
		System.out.println(z);
		try {
			Thread.sleep(3000);  //THREAD KEYWORD
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			func2();
		}catch(Exception e){
			System.out.println(e.getMessage()+ " occured.");
		}
		}
	
	static void func2()throws ArrayIndexOutOfBoundsException{
		//THROWS KEYWORD in java used in the signature of method to indicate that this method
		//might throw one of the listed type exception.The caller to these method has to handle the exception using try-catch block.
		
		boolean isDanger=true;
		if(isDanger){
			//THROW KEYWORD in java used to explicitly throw an exception from a method or any block of code.
			
			
			throw new ArrayIndexOutOfBoundsException("Danger is coming");	
	}
}
}