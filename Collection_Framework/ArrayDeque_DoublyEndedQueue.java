package Collection_Framework;

import java.util.ArrayDeque;

//An ArrayDeque(also known as an "Array Double Ended Queue",pronounced as "ArrayDeck") is a special kind of a growable array that 
//allows us to add or remove an element from both sides.
//
//
//An ArrayDeque implementation can be used as a stack(Last In First Out) or Queue(First In First Out).
//
//
//METHODS:-
//*offerfirst()  //*offerlast()
//*pollfirst()   //*polllast()
//*peekfirst()   //*peeklast()
public class ArrayDeque_DoublyEndedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> ad=new ArrayDeque<>();
ad.addFirst(12);
ad.addFirst(34);
ad.addFirst(556);
ad.add(54);
ad.offerLast(25);
System.out.println(ad);
System.out.println(ad.pollFirst());
System.out.println(ad.peekFirst());
System.out.println(ad.pollLast());
	}

}
