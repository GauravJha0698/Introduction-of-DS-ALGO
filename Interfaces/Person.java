package Interfaces;

public class Person implements Student,Youtuber{
public static void main(String args[]) {
	// TODO Auto-generated method stub
Person p=new Person();
p.study();
p.makeVideo();
}

@Override
public void study() {
	// TODO Auto-generated method stub
	System.out.println("Person is studying");
}

@Override
public void makeVideo() {
	// TODO Auto-generated method stub
	System.out.println("Person is making Youtube videos");
}
}
