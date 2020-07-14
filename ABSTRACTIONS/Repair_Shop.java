package ABSTRACTIONS;

public class Repair_Shop {
public static void repairCar(Cars car){
	System.out.println("Car is repaired");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Audi a=new Audi();
Bmw b=new Bmw();
Mercedes m=new Mercedes();
repairCar(a);
repairCar(b);
repairCar(m);
	}

}
