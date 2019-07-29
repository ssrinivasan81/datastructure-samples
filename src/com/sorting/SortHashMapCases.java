package com.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortHashMapCases {

	public static void main(String[] args) {
		HashMap<String, Integer> hh = new HashMap<>();
		hh.put("Srini1", 30);
		hh.put("Srini2", 33);
		hh.put("Srini8", 306);
		hh.put("Srini3", 24);
		hh.put("Srini5", 76);
		
		// Sort based on Values (** Interview Question **)
		// ----------------------------------------------------------		
		List<Map.Entry<String, Integer>> vsortlist = new LinkedList<Map.Entry<String, Integer>>(hh.entrySet());
		
		Map<String, Integer> sortedmap = vsortlist.stream()
											.sorted( (Map.Entry<String,Integer> map1, Map.Entry<String, Integer> map2) -> {
													return (int) Integer.valueOf(map1.getValue()) - Integer.valueOf(map2.getValue()); 
											})
											.collect(Collectors.toMap( Map.Entry<String,Integer> :: getKey , 
													                   Map.Entry<String,Integer> :: getValue 
													                   , (x,y) -> x, LinkedHashMap::new));
		
		//sortedmap.entrySet().forEach(item -> System.out.println(item.getKey() +"-"+ item.getValue()));
		System.out.println("Sorted Based on value:"+sortedmap);
		
		
	}

}
