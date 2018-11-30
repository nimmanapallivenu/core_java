package com.arrays;

public class SearchingAlgorithm {

	static int[] ages = { 20, 50, 65, 14, 87, 29, 34 };

	public static void main(String[] args) {

		System.out.println("Serach "+search(34) );
		
	}

	static int search(int key) {

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
