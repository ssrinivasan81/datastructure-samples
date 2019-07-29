package com.sample;

import java.util.HashMap;
import java.util.Map;

public class Java8MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Srini",1999);
		map.put("Vasau",4999);
		map.put("Test",1999);
		map.put("Initi",2999);
		
		map.replaceAll((name,oldvalue) -> name.equals("Srini") ? 5000 : oldvalue);
		
		System.out.println(map);
	}

}
