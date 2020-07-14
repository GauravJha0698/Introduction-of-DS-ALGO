package Collection_Framework;
import java.util.*;

import Collection_Framework.MyLinkedList.Node;
public class LinkedList_GET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList_GET g=new LinkedList_GET();
g.add(12);
g.add(3);
g.add(34);
g.add(50);
g.printAdd();


	}
	void add(int data){
		Node toAdd=new Node(data);
		if(isEmpty()){
			head=toAdd;
			return;
			
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=toAdd;
		}
		boolean isEmpty(){
			return head==null; 
		}
	Node head;
	public Node get(int data,int n){
		Node toGet=new Node(data);

		if(head==null){
			return null;
		}
		if(n<=0){
			throw new IllegalArgumentException("Invalid value: n = "+n);
		}
		Node mainptr=head;
		Node refptr=head;
		int count =0;
		while(count<n){
			if(refptr==null){
				throw new IllegalArgumentException("Invalid value: n = "+n);
			}
			refptr=refptr.next;
			count++;
		}
		while(refptr!=null){
			refptr=refptr.next;
			mainptr=mainptr.next;
		}
		return mainptr;
		}
	void printAdd(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
	}
	}
	void print(){
		Node refptr=head;
		while(refptr!=null){
			System.out.println(refptr.data+" ");
		}
		if (head==null){
			System.out.println("null");
		}
	}
		
	

static class Node{
	int data;
	Node next;
	int n;
	public Node(int data){
		this.data=data;
		next=null;
		this.n=n;
	}
}
}
