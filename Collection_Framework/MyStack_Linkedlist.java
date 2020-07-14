package Collection_Framework;
import Collection_Framework.MyLinkedList;
public class MyStack_Linkedlist<E> {
	private MyLinkedList<E> ll=new MyLinkedList<>();
void push(E e){
	ll.add(e);
}
E pop()throws Exception{
	if(ll.isEmpty()){
		throw new Exception("Popping from empty stack is not allow"); 
	}
	return ll.removeLast();
}
E peek()throws Exception{
	if(ll.isEmpty()){
		throw new Exception("Peeking from empty stack is not allow"); 
	}
	return ll.getLast();
}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		MyStack_Linkedlist<Integer> ms=new MyStack_Linkedlist<>();
		ms.push(12);
		ms.push(8);
		ms.push(14);
		ms.push(20);
		System.out.println(ms);
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		
	}

}
