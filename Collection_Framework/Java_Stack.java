package Collection_Framework;
//In Stack,elements are stored and accessed in Last In First Out manner.
//
//That is,elements are added to the top of the stack and removed from the top of the stack.
//
//
//The Java Collection Framework has a class named Stack that provides the functionality of the Stack Data Structure.
//The Stack class extends the Vector class.
//
//
//
//METHODS OF STACK:-
//*push(E e)
//*pop()
//*peek()
//*search(E e)
//*empty()

import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s=new Stack<>();
s.push(12);
s.push(24);
s.push(36);
s.push(48);
System.out.println(s);
int popped=s.pop();
System.out.println(popped);
System.out.println(s);
System.out.println(s.peek());

	}

}
