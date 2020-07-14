package Collection_Framework;

import Collection_Framework.MyLinkedList.Node;

public class MyQueue_LinkedList<E> {
private Node<E> head,rear;
public void enqueue(E e){
	Node<E> toAdd=new Node<>(e);
	if(head==null){
		head=rear=toAdd;
		return;
	}
	
	rear.next=toAdd;
	rear=rear.next;
}
public E peek(){
	if(head==null){
		return null;
	}
	Node<E> temp=head;
	while(temp.next!=null){
		return temp.data;
	}
	return null;
}
public E dequeue(){
	if(head==null){
		return null;
	}
	if(head==null){
		rear=null;
	}
	Node<E> temp=head;
	head=head.next;
	return temp.data;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue_LinkedList<Integer> mq=new MyQueue_LinkedList<>();
		mq.enqueue(12);
		mq.enqueue(24);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(657);
		System.out.println(mq.dequeue());
		mq.enqueue(3);
		mq.enqueue(54);
		System.out.println(mq.peek());
	}

}
