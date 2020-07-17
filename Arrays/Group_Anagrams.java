package Arrays;

import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Group_Anagrams g=new Group_Anagrams();


	}
	
public List<List<String>> groupAnagrams(String[] strs){
	Map<String,List<String>> m=new HashMap<>();
	for(String s:strs){
		char charArray[]=s.toCharArray();
		Arrays.sort(charArray);
		String sorted=new String(charArray);
		if(!m.containsKey(sorted)){
			m.put(sorted, new LinkedList<String>());
		}
		m.get(sorted).add(s);
		
	}
	return new LinkedList<>(m.values());
}
}

