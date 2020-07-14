package Collection_Framework;

import java.util.*;

//LinkedList are linear data structures where the elements are not stored
//in contiguous locations and every element is a separate object with a data part and address part.
//The elements are linked using pointers and addresses.Each element is known as a node.
//Due to the dynamicity and ease of insertions and deletions,they are preffered over the arrays.
//
//
//It has a disadvantages that we cannot access a node directly instead we need to start from the HEAD and follow through the link to reach to a node we wish to access. 
public class LinkedList_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> ll=new LinkedList<>();
List<Integer> al=new ArrayList<>();
//ll.add(12);
//ll.add(32);
//ll.add(63);
//ll.add(78);
//ll.set(2, 34);
//System.out.println(ll.get(1));
//
//System.out.println(ll);
getDiff(ll);
getDiff(al);
	}
static void getDiff(List<Integer> list){
	long start=System.currentTimeMillis();
	for(int i=0;i<100000;i++){
		list.add(0,i);
	}
	long end=System.currentTimeMillis();
	System.out.println(list.getClass().getName()+ " --> " +(end-start));
}
	

}
