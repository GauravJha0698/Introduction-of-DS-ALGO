package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

//In Queues,elements are stored and accessed in First In,First Out manner.
//That is,elements are added from the behind and remove from the front.
//
//
//METHODS OF QUEUE:=
//(throws Exception)      //(return false/null)
//*add().                    //*offer().
//*remove().                 //*poll().
//*element().                //*peek().
public class Queue_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> q=new LinkedList<>();
System.out.println(q.poll());
q.add(12);
q.add(34);
q.add(54);
System.out.println(q);
q.remove();
System.out.println(q);
System.out.println(q.element());

	}

}
