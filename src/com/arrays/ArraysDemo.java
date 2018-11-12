package com.arrays;

/**
 * Array collection of similar data types
 * 
 * int 1 to 100..
 * int num1=1
 * int num2 =2;..... int num10 =100;
 * 
 *two ways 
 
 * int[] ages = {2,4,5,6,7,9};
 * n-1
 * 
 * 10-1
 * 9
 * starts from 0 to n-1
 * 
 *delcaration 
 * int[] ages;
 * 
 *  int ages[];
 *  
 * inilization
 * ages = new int[100];  
 * 
 * double salaries = new double[10];
 * 
 * 
 * @author VENU
 *
 */
public class ArraysDemo {

	public static void main(String[] args) {
		
		double[] heights = {3.2,4.3,5.6,6.0,6.1};
		
		for(int i=0;i<heights.length;i++) {
			
			System.out.println(i +" value : "+ heights[i]);
		}
		
		
		// random access 
		
		 System.out.println(" 2 index value:\t "+ heights[2]);
		 
		// if u excedes size access 
		 //ArrayIndexOutOfBoundsException: 6
		// System.out.print(heights[6]);
		 
		 //java.lang.ArithmeticException
		 System.out.println(10/2);
		 
		
		int[] list ;
		
		list = new int[10];
		
		list[0] = 10;
		list[2]=30;
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(i +" value : "+ list[i]);
		}
		print(list);
		
		// one line 
		
		long[] sal = new long[20];
		
		sal[10]=20l;
		
		System.out.println("Length "+sal.length);
		
		
		
	}
	
	
	
	
	
	
	static void print(int[] ages) {
		System.out.println("Print method......");
		for (int i = 0; i < ages.length; i++) {
			System.out.println(i +" value : "+ ages[i]);
		}
	}
	

}
