package Collection_Framework;

import java.util.*;

//In Java,It provides the features of mathematical set in Java.
//It extends the Collection Interface.Unlike the List Interface,sets cannot contain duplicate elements.
//In order to use functionalities of Set Interface,we can use these classes:-
//
//*EnumSet
//*HashSet
//*LinkedHashSet
//*TreeSet
//
//METHODS:-
//*add(),*addall(),*remove(),*removeall(),*retain(),*contain(),
//*containall(),*clear(),*size(),*toArray().
public class Set_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> fruits=new HashSet<>();
fruits.add("Apple");
fruits.add("kiwi");
fruits.add("Guava");
fruits.add("Banana");
fruits.add("Mango");
//System.out.println(fruits);
Set<Integer> x=new HashSet<>();
x.add(23);
x.add(34);
x.add(55);
x.add(12);
x.add(67);
Set<Integer> y=new HashSet<>();
y.add(12);
y.add(45);
y.add(67);

x.addAll(y);
x.retainAll(y);
System.out.println(x);
System.out.println(x.containsAll(y));
	}

}
