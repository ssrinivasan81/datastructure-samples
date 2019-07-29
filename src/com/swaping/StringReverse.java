package com.swaping;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Srinivasan";
		char[] arr = str.toCharArray();		
		
 		int left = 0;
		int right = arr.length - 1;
		for (left = 0; left < right ; left++, right-- ) {
			char temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
		}
		
		for (char c : arr) {
			System.out.print(c);
		}	

		
	}

}
