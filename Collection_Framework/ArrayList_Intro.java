package Collection_Framework;

import java.util.List;
import java.util.ArrayList;

public class ArrayList_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> fruits=new ArrayList<>();
List<String> vegetables=new ArrayList<>();
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Banana");
vegetables.add("Potato");
vegetables.add("Tomato");
vegetables.add("Brinjal");
fruits.addAll(vegetables);
fruits.set(1, "Mango");

//fruits.clear();
ArrayList<String> toRemove=new ArrayList<>();
toRemove.add("Potato");
fruits.removeAll(toRemove);
System.out.println(fruits);
System.out.println(fruits.get(2));
System.out.println(fruits.size());
System.out.println(fruits.contains("Banana"));
System.out.println(fruits.isEmpty());
String temp[]=new String[fruits.size()];
fruits.toArray(temp);
for(String e:temp){
	System.out.println(e);
}

Pair<String,Integer> p1=new Pair("Gaurav",40);
Pair<Boolean,String> p2=new Pair(true,"Abdul");
p1.getDescription();
p2.getDescription();
	}

}
