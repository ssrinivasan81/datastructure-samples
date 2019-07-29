package com.datastructure;

import java.util.Arrays;

//------------------------------------------------------------
// THUMB Rule: BINARY SEARCH applicable only for SORTED LIST.
// ------------------------------------------------------------
public class BinarySearch {
	
	public static int binarySearch(int[] arr, int start, int totalcount, int k) {
		
		if (totalcount >= start) {
			int mid = start + (totalcount - start) / 2;			
			
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				return binarySearch(arr, mid+1, totalcount, k);
			} else {
				return binarySearch(arr, 0, mid-1, k);
			}	
		}		
		return -1;
	}
	public static void main(String[] args) {

		BinarySearch ob = new BinarySearch(); 
	    int arr[] = { 8,55,2, 3, 4, 10, 40 };
	    Arrays.sort(arr);
	    
	    int x = 40; 
	    int result = ob.binarySearch(arr, 0, arr.length - 1, x); 
	    if (result == -1) 
	        System.out.println("Element not present"); 
	    else
	        System.out.println("Element found at index " + result); 
	}

}
