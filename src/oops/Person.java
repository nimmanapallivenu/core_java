package oops; // package declaration 

// import need to be added here
import java.util.List;

//class 

public class Person {

	public static void main(String args[]) {
	/*M1 m1; // object decralation
	
	m1= new M1(); // object creation
	
	m1.sum(10,20);
	
	System.out.println("Sum Value is "+ m1.c);*/
		
		
	/*M2 m2= new M2();
	
	int output =m2.squore(10);
	System.out.println(output);*/
		
		
	/*A1 a1 = new A1();
	
	System.out.println(a1.sayHello());*/
		
	/*
		A2 a2 = new A2();
		
		a2.setName("Venu");
		
		String name=a2.getName();
		System.out.println(name);
		
		System.out.println(a2.getName());*/
		
		
		System.out.println(S1.getPintCode());
		
		System.out.println(S1.getLocation());
		
	}
	
}

class M1 {

	  int c;
	
	 void sum(int a, int b) {
		 c = a + b;
		
	}
	 
	 

}

class M2 {

	int squore(int x) { // 10
		int y = x * x; // y = 10*10; y= 100;
		return y;// return 100;
	}

}

class A1 {

	protected String sayHello() {
		return "Hello Mourya!... Good Morning... How are you doing ...?";
	}

}

class A2 {

	private String name;
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return name;
	}

}

class S1 {

	private static int pinCode = 560016;

	public static String getLocation() {
		return "USA";
	}
	
	static int getPintCode() {
		return pinCode;
	}

}
