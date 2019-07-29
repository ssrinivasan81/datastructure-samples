package com.datastructure;

public class MatrixDiagonal {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3} , {5,3,2} , {8,5,4} 
		};
		
		int leftdiagonal = 0;
		int rightdiagonal = 0;		
		int n = 3;
		for (int i=0;i<matrix.length;i++) {
			System.out.println(matrix [i][n - i -1]);
			leftdiagonal += matrix[i][i];
			rightdiagonal += matrix[i][n - i -1];		
		}
		System.out.println("Left Diagonal:"+ leftdiagonal +" Right Diagonal:"+ rightdiagonal );
	}
}
