package com.datastructure;

public class InterchangeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,2,1,2,0};
		int x = arr.length;
		int temp;
		for (int i=0;i<x;i++) {
			for (int j=i+1;j<x;j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j]= arr[i];
					arr[i]= temp;					
				}
			}
		}
		
		 for (int va=0;va<arr.length;va++) {
			 System.out.println(arr[va]);
		 }
	}

}
