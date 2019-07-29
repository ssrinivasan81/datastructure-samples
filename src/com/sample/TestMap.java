package com.sample;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class TestMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap<>();
		map.put("Sr", new Student("Srini", "M", 10));
		map.put("Sr", new Student("Srinivasan", "M", 10));
		map.put("Sr1", new Student("Srini1", "M", 10));
		
		map.entrySet().forEach(item -> System.out.println(item.getKey() +" "+ item.getValue().getName()));
		
		MultiValuedMap<String, Student> mm = new ArrayListValuedHashMap<>();
		mm.put("Sr", new Student("Srini", "M", 10));
		mm.put("Sr", new Student("Srinivasan", "M", 10));
		mm.put("Sr1", new Student("Srini1", "M", 10));
		
		mm.entries().forEach(item -> System.out.println(item.getKey()));
		
	}
}
