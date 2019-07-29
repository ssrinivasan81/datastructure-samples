package com.sample;

import java.util.HashMap;

public class FindDuplicateCharacters {

	public static void main(String args[]) {
		countCharacters("srinivasan");
		countCharacters("vasugisankar");
	}
	public static void countCharacters(String word) {
		char[] characters = word.toCharArray();
		
		String s1="42";
		String s2 = "42";
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("----");
		}
		
		if (s1.indexOf('.') > 0) {
			s1 = s1.substring(0, s1.indexOf('.'));
		}
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("-**-");
		}
		System.out.println(s1);
		HashMap<Character,Integer> hashmap = new HashMap<>();
		
		for (char ch : characters) {
			if (hashmap.containsKey(ch)) {
				hashmap.put(ch, hashmap.get(ch) + 1);
			} else {
				hashmap.put(ch,1);
			}
		}
		System.out.println("Word:"+word);		
		hashmap.entrySet().forEach(i -> System.out.println(i.getKey() +"-"+i.getValue()));		
	}
}
