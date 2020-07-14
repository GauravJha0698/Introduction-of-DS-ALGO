
 public class Reverse_String {
	
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
	
		
		String a="I love Java, the coffee";
	    //"coffee the Java, love I"
	String ans=" ";

for(int i=a.length()-1;i>=0;i--){
	//for(int j=a.length()-1;j>0;j--){
	
	//int j=0;
	//if(i>=0 && a.charAt(i)==' ')
	
	while(i>=0 && a.charAt(i)==' ')i--;
	 int j=i;
	

	if(i<0){
		break;
	}
		while(i>=0 && a.charAt(i)!=' ')
		i--;
	if(ans.isEmpty()){
		ans=ans.concat(a.substring(i+1, j+1));
	}else{
		ans=ans.concat(" "+a.substring(i+1, j+1));
	}
	
	System.out.println(ans);
	
}



//StringBuffer sb=new StringBuffer(a);
//String reverse=sb.reverse().toString();
//System.out.println(a);
//System.out.println(reverse);
	}

}
