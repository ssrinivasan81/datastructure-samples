package com.datastructure.arrays;

public class SecondLargestNumberInArray {

	// To find second largest Number
	// -------------------------------
	public static void main(String[] args) {
		
		int[] iarray = {5,8,45,88,52,4};		
		
		int first = 0;
		int second = 0;
		
		for (int k=0;k<iarray.length;k++) {
			
			if (iarray[k] > first) {
				second = first;
				first = iarray[k];
			}
			if (iarray[k] < first && iarray[k] > second) {
				second = iarray[k];
			}
		}
		
		System.out.println("first:"+ first+ " Second:"+second);
		
	}

}
