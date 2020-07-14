package Interfaces;

public class Reactangle implements Area,Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Reactangle r=new Reactangle();
Reactangle r1=new Reactangle();
Area a=r;
Parameter p=r1;
p.peri();
a.getArea();//Up casting is possible in interfaces.
r.getParameter();
r.peri();
	}

	@Override
	public void getParameter() {
		// TODO Auto-generated method stub
		int l=2;
		int b=3;
		int p=2*(l+b);
		System.out.println("Perimeter: "+p);
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int l=4;
		int b=5;
		int a=l*b;
		System.out.println("Area: "+a);
	}

	@Override
	public void peri() {
		// TODO Auto-generated method stub
		Parameter.super.peri();
	}

}
