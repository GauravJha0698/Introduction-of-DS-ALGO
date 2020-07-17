package Collection_Framework;

import java.util.*;

//HashCode() and Equals() methods have been defined in Object class 
//which is parent class for Java Objects.For this reason,all java objects inherits a  
//default implementation of these methods.
public class HashCode_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pen p1=new Pen(10,"blue");
Pen p2=new Pen(10,"blue");
//System.out.println(p1);
//System.out.println(p2);
//System.out.println(p1.equals(p2));
Set<Pen> pens=new HashSet<>();
pens.add(p1);
pens.add(p2);
System.out.println(pens);
	}

}
class Pen{
	int price;
	String color;
	public Pen(int price, String color){
		this.color=color;
		this.price=price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	//public boolean equals(Object obj){
	//Pen that=(Pen)obj;
	//boolean isEqual=this.price==that.price &&
	//      this.color.equals(that.color);
	//return isEqual;}
	//
	//public int hashCode(){
	//return price+color.HashCode();}
}