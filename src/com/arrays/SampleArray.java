package com.arrays;

public class SampleArray {

	public static void main(String[] args) {
		System.out.println("=================");
		int[] list = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < list.length; i++) {
			System.out.print(i +"\t "+list[i]);
			System.out.println();
		}
		
		System.out.println("=================");
		// second way of creating array object
		int[] mylist = new int[10];
			mylist[0]=10;
			mylist[2] =20;
			
			for (int i = 0; i < mylist.length; i++) {
				System.out.print(i +"\t "+mylist[i]);
				System.out.println();
			}	
			
			System.out.println("=================");
			
			
			
			System.out.println("mylist[2] "+mylist[2]);
			
			
	}
}
