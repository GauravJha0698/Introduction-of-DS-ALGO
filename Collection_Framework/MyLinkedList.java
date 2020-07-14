package Collection_Framework;

public class MyLinkedList<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyLinkedList<Integer> mLL=new MyLinkedList<>();
for(int i=0;i<10;i++){
	mLL.add(i);
}

mLL.print();
	}
	Node<E> head;
	public void add(E data){
	Node<E> toAdd=new Node<E>(data);
	if(isEmpty()){
		head=toAdd;
		return;
		
	}
	Node<E> temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=toAdd;
	}
	public boolean isEmpty(){
		return head==null; 
	}
	public E getLast()throws Exception{
		Node<E> temp=head;
		if(temp==null){
			throw new Exception("Cannot peek last element from empty linkedlist");
		}
		
		
		while(temp.next!=null){
			temp=temp.next;
		}
		
		return temp.data;
	}
	public E removeLast()throws Exception{
		Node<E> temp=head;
		if(temp==null){
			throw new Exception("Cannot remove last element from empty linkedlist");
		}
		
		if(temp.next==null){
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
		while(temp.next.next!=null){
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return toRemove.data;
	}
	void print(){
		Node<E> temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
static class Node<E>{
	E data;
	Node<E> next;
	public Node(E data){
		this.data=data;
		next=null;
	}
}
}
