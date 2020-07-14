package Collection_Framework;
//The Vector class is an implementation of the List Interface that 
//allows us to create re-sizable arrays similar to the ArrayList Class.
//
//
//
//In Java,both ArrayList and Vector implements the List Interface and provides the same functionalities.
//However,there exist some differences between them.The Vector class synchronizes each individual operation.
//This means whenever we want to perform some operation on vectors,the vector class automatically applies a lock to that operation.
//However,in array list,methods are not synchronized.
//
//It is recommended to use ArrayList in place of Vector because vectors are thread safe and are less efficient.


import java.util.Vector;

public class Java_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v=new Vector<>();
v.add(8);
v.add(12);
v.add(18);
v.add(24);
System.out.println(v);
	}

}
