package day1.example;
  //ANAGRAMS IS THE SAME NUMBER OF CAHARACTER PRESENT IN TWO STRINGS.
  //IT IS ALSO EQUAL NO. OF TIME OF REPEATATION OF BOTH STRINGS.       
public class Anagrams_String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="silent";
String b="listen";
boolean isAnagram=false;
boolean visited[]=new boolean[b.length()];

if(a.length()==b.length()){
	for(int i=0;i<a.length();i++){
		char c=a.charAt(i);
		isAnagram=false;
		for(int j=0;j<b.length();j++){
			if(b.charAt(j)==c && !visited[j] ){
				visited[j]=true;
				isAnagram=true;
				break;
			}
			
		}
		if(!isAnagram){
			break;
		}
	}
}
if(isAnagram){
	System.out.println("Anagram");
}else{
	System.out.println("Not Anagram");
}

	}

}
