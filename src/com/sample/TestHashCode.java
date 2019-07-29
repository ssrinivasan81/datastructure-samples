package com.sample;

import java.util.HashMap;
import java.util.Map;

public class TestHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, Integer> map =  new HashMap<>();
		Person person1 = new Person("Srini", "M","35", "Srini","M","1");
		Person person2 = new Person("Srin1i", "M","35", "Srini","M","1");
		
		map.put(person1,1);
		map.put(person2, 1);
		
		map.entrySet().forEach(item -> System.out.println(item.getKey().getName()));
		System.out.println(map.size());
	}

}
