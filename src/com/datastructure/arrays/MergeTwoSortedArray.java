package com.datastructure.arrays;

public class MergeTwoSortedArray {

	static void mergeArray(int[] a, int[] b, int[] c, int n1, int n2) {
		int i=0;
		int j=0;
		int k=0;
		
		while (i< n1 && j< n2) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];				
			} else {
				c[k++] = b[j++];
			}
		}
		
		while (i < n1) {
			c[k++] = a[i++];
		}
		while (j < n2) {
			c[k++] = b[j++];
		}
		for (int l=0; l < n1+n2; l++) 
            System.out.print(c[l] + " "); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,7,9};
		int[] b = {2,3,8};
		
		int n1 = a.length;
		int n2 = b.length;
		
		int[] c = new int[n1+n2];
		
		mergeArray(a, b, c, n1, n2);
	}

}
