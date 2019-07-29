package com.searching;

import java.util.Arrays;

//Java program to find index of  an element in N elements

public class BinarySearchSample {

	public static void main(String[] args) {
		int[] my_array = { 1, 2, 3, 4, 5, 6, 7 };		
        System.out.println("Index position of 5 is: " + findIndex(my_array, 5));
	}
	
	public static int findIndex(int[] arr, int k) {		
		int index = Arrays.binarySearch(arr, k);
		return index > 0 ? index : -1;
	}
}

