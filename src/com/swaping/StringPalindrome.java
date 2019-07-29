package com.swaping;

public class StringPalindrome {

	public static boolean isReverser(String str) {
		
		int i=0;
		int j=str.length() -1;
		
		while (i< j) {
			if ((str.charAt(i)) != (str.charAt(j))) 
				return  Boolean.FALSE;
			
			i++;
			j--;
		}
		return Boolean.TRUE;
	}
	public static void main (String[] args) {
		String abs= "ramarss";
		
		System.out.println(isReverser(abs));
	}
}
