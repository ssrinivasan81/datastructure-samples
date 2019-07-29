package com.sample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class hflatmap {
	public static void main(String[] args) {
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));
		
		List<String> str = Arrays.asList("wqe","asb","asdf");
		Map<String, Integer> hamp = str.stream()
				.collect(Collectors.toMap(Function.identity(), String::length , (e1, e2) -> e1, LinkedHashMap::new ) );
		List<Integer> ll = str.stream().map(item -> item.length()).collect(Collectors.toList());
		System.out.println(ll);
		System.out.println(hamp);
		List<String> lst = people.values().stream()
			.flatMap(Collection::stream)
			.collect(Collectors.toList());
		
		System.out.println(lst);
		String str1="test";
		Optional.ofNullable(str1).map(String::trim).orElseGet(() -> null);
		
		HashMap<String, Integer> hh = new HashMap<>();
		hh.put("Srini1", 30);
		hh.put("Srini2", 33);
		hh.put("Srini8", 306);
		hh.put("Srini3", 24);
		hh.put("Srini5", 76);
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hh.entrySet());
		
		
		Map<String, Integer> temp2 = list.stream().sorted( ( Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) -> {
			return (int) Integer.valueOf(m1.getValue()).compareTo(Integer.valueOf(m2.getValue()));
		}).collect(Collectors.toMap( Map.Entry<String, Integer> :: getKey , Map.Entry<String, Integer> :: getValue, (x, y) -> x , LinkedHashMap::new));
		// Ends		
  
		temp2.entrySet().forEach(item -> System.out.println(item.getKey() +"--"+ item.getValue()));
        
        
		
	}
}
