package core_java;

import org.springframework.core.Constants;

public class Demo {
	byte bBtye;
	short sShort;
	int iInt;
	long lLong;
	float fFloat;
	double dDouble;
	char cChar;
	boolean bboolean;
	
	void print() {
		System.out.println("bBtye = "+bBtye);
		System.out.println("sShort = "+sShort);
		System.out.println("iInt = "+iInt);
		System.out.println("lLong = "+lLong);
		
		System.out.println("fFloat = "+fFloat);
		
		System.out.println("dDouble = "+dDouble);
		
		System.out.println("cChar = "+cChar);
		System.out.println("bboolean  = "+bboolean);
	}
	
	void assignValues() {
		 bBtye=4;
		 sShort=34;
		 iInt=67656;
		 lLong=8785768l;
		 fFloat= 4787.98278f;
		 dDouble=120.00987776666;
		 cChar='v';
		 bboolean=true;
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		// variables and methods
		
	System.out.println("============================");
	
	demo.print();
	System.out.println("============================");
	
	demo.assignValues();
	demo.print();
	}
}
