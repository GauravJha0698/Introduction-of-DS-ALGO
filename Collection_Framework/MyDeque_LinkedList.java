package Collection_Framework;

public class MyDeque_LinkedList<E> {
	Node<E> head,tail;
	public void addToHead(E data){
		Node<E> toAdd=new Node<>(data);
		if(head==null){
			head=tail=toAdd;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
		
	}
	public void addToTail(E data){
		Node<E> toAdd1=new Node<>(data);
		if(head==null){
			head=tail=toAdd1;
		}
		head.prev=toAdd1;
		toAdd1.next=head;
		head=toAdd1;
		
	}
	public E removeLast(){
		if(head==null){
			return null;
		}
		Node<E> toRemove=tail;
		tail=tail.next;
		tail.prev=null;
		return toRemove.data;
		
	}
	public E removeFirst(){
		if(head==null){
			return null;
		}
		Node<E> toRemove1=head;
		head=head.next;
		head.prev=null;
		return toRemove1.data;
		
	}
public static class Node<E>{
	E data;
	Node<E> next,prev;
	public Node(E data){
		this.data=data;
		this.next=this.prev=null;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDeque_LinkedList<Integer> mdl=new MyDeque_LinkedList<>();
		mdl.addToHead(12);
		mdl.addToHead(67);
		mdl.addToHead(78);
		mdl.addToTail(789);
		mdl.addToTail(567);
		System.out.println(mdl);
		System.out.println(mdl.removeLast());
		System.out.println(mdl.removeFirst());
	}

}
