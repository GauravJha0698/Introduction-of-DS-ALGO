package Collection_Framework;

import java.util.*;
import java.util.Map.Entry;

//In Java,elements of Map are stored in key/value pairs.Keys are 
//unique values associated with individual values.A map cannot 
//contain duplicate keys.And,each key is associated with a single value.
//
//METHODS:-
//*put(K,V),putAll(),putIfAbsent(K,V),get(K),getOrDefault(K,default value)
//containsKey(K),containsValue(V),replace(K,V),replace(K,Old V,New V),remove(K)
//*entryset().
//
//
//HASHMAP uses an array table to store its key value pairs.
//Each element of the array holds the head of a linkedlist to avoid collision.
//THe Hash of every key is calculated and the elements are placed in the array using this Hash Function.
//
//The default capacity is kept at 16 and the load factor at 0.75.


public class HashMap_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> num=new HashMap<>();
num.put("Gaurav", 40);
num.put("Abdul", 51);
num.put("Vivek", 02);
num.putIfAbsent("Gaurav", 50);

System.out.println(num);
System.out.println(num.get("Gaurav"));
System.out.println(num.containsKey("Abdul"));
System.out.println(num.containsValue(51));
//System.out.println(num.remove("Vivek"));
//System.out.println(num.remove("Abdul", 51));
System.out.println(num.keySet());
System.out.println(num.values());
System.out.println(num.entrySet());
Set<Entry<String,Integer>> entries=num.entrySet();
for(Entry<String,Integer> entry:entries){
	entry.setValue(entry.getValue()*100);
}
System.out.println(num);




System.out.println(getHash("CAT"));
//CHAINING TECHNIQUE IS USED TO TACKLE COLLISION.
	}
	
	
	//FIND ASCII VALUE OF ANY STRING//
public static int getHash(String s){
	int hash=0;
	for(int i=0;i<s.length();i++){
		hash+=s.charAt(i);
		
	}
	return hash;
}
}
