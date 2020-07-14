package Collection_Framework;
//A Priority Queue is a special type of queue in which each element is associated with a priority and is served according to its priority.
//If elements with the same priority occur,they are served according to their order in the queue.
//
//
//In a Queue,the First-In-First-Out rule is implemented whereas in a Priority Queue,the values are removed on the basis of priority.
//
import java.util.*;
public class PriorityQueue1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> pq=new PriorityQueue<>();
PriorityQueue<Integer> pq1=new PriorityQueue<>();
pq.add("Mango");
pq.add("Banana");
pq.add("Apple");
pq.add("Orange");
pq.add("Kiwi");
pq1.add(10);
pq1.add(90);
pq1.add(30);
pq1.add(70);
pq1.add(50);

System.out.println(pq);
System.out.println(pq.remove());
System.out.println(pq.remove());
System.out.println(pq.remove());
System.out.println(pq.remove());
System.out.println(pq.remove());
System.out.println(pq1);
System.out.println(pq1.remove());
System.out.println(pq1.remove());
System.out.println(pq1.remove());
System.out.println(pq1.remove());
System.out.println(pq1.remove());
	}
}