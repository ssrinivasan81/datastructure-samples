package com.sample;

public class NextHighest {
	
	public static void main (String[] args) {
		int arr[] = {20,12,10,5,9,5,15};
		findHighest(arr, arr.length);
	}
	
	public static void findHighest(int arr[] , int length) {
		
		int i,j;
		int val = 0;
		for (i = 0; i < length; i++) {
			val = -1;
			for (j = i; j<length; j++) {
				if (arr[i] < arr[j]) {
					val = arr[j];
					break;
				}
			}
			System.out.println(arr[i] +"->"+ val);
		}
	}
}
