package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MapFlatMap {

	public static void main(String[] args) {
		String[] arrayofworkds = {"STACK","OOVVERFLOW"};
		Stream<String> list = 
				Arrays.stream(arrayofworkds);
		
		List<String> stream = list
			.map(e -> e.split(""))
			.flatMap(Arrays::stream)
			.distinct()
			.collect(Collectors.toList());
		
		stream.forEach(l -> System.out.print(l));
		System.out.println("------------");
		stream.forEach(System.out ::print);	
	}

}
