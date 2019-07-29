package com.datastructure.arrays;

public class FindKNumberInMatrix {

	static void findNumber(int[][] arr, int matrix, int numbertofind) {
		int i=0;
		int j= matrix - 1;
		
		while (i < matrix && j >= 0 ) {
			if (arr[i][j]  == numbertofind) {
				System.out.println("Found at: ("+ i +","+j + ")" );
			}
			if (arr[i][i] >  numbertofind) {
				j-- ;
			} else {
				i++;
			}			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] iarr = { {1,2,3,4} , {5,6,7,8} , {9,10,11,13}, {14,15,16,17} };
		
		findNumber(iarr, 4 , 7);		
	}
}
