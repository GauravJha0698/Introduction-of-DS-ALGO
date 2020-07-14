package Object_Oriented;

public class Appconfig {
	private Appconfig(){
		
	}
	private static Appconfig obj=new Appconfig();
	public static Appconfig getInstance(){
		return obj;
	}
public static void main(String args[]){
	Appconfig obj=Appconfig.getInstance();
	Appconfig obj1=Appconfig.getInstance();
}
}
