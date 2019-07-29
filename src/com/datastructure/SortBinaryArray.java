package com.datastructure;

public class SortBinaryArray {

	static void sortBinaryArray(int[] arr, int size) {
		
		int j=0;
		for (int i=0; i< arr.length ;i++) {
			if (arr[i] < 1) {				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}			
		}		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 
                 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 }; 

	     int n = a.length; 
	
	     sortBinaryArray(a, n); 
	     for (int i = 0; i < n; i++) 
	         System.out.print(a[i] + " "); 
	     
		}

}
