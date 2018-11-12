package com.arrays;

public class SortingAlgorithm {

	
	static int[]  ages = {20,50,65,14,87,29,34};
	
	
	public static void main(String[] args) {
		// output 14,20,29,34,50,65,87
		
		print();
		for (int i = 0; i < ages.length; i++) {
		
			int temp =i;
			
			for (int j = i+1; j < ages.length; j++) {
				
				if(ages[temp] >ages[j]) {
					swap(temp,j);
					temp = j;
				}
				
			}
		}
		System.out.println("After Sorting ------------");
		print();
		
		
		
	}
	
	static void print() {

		for (int i = 0; i < ages.length; i++) {
			System.out.println(i + " index value " + ages[i]);
		}
	}
	
	static void swap(int to ,int from) {
		System.out.println("Swap numbers " + ages[to] +" into " + ages[from]);
		
		int temp= ages[to];
		ages[to] = ages[from];
		ages[from] = temp;
		print();
		
	}
	

}
