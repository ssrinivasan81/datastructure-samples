package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8FlatMap {	
		private String name;		
		private List<String> items;		
	
		public Java8FlatMap(String name , List<String> items) {
			this.name = name;
			this.items = items;
		}
		public List<String> getItems() {
			return items;
		}
			
	
		public String getName() {
			return name;
		}

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		l1.add("amazon");
		l1.add("laptop");
		l1.add("mobile");
		
		l1.add("ebat");
		l1.add("pen");
		l1.add("stand");	
		Java8FlatMap amazon = new Java8FlatMap("amazon", l1);
		Java8FlatMap ebay =  new Java8FlatMap("ebay", l2);
		
		List<Java8FlatMap> parcels = Arrays.asList(amazon, ebay);
		
		List<String> l3 = 
		parcels.stream()
			.map(Java8FlatMap :: getItems)
			.flatMap(Collection::stream)
			.collect(Collectors.toList());

		List<String> l4 = 
		parcels.stream()
			.map(Java8FlatMap :: getName)
			.collect(Collectors.toList());
		
		//l3.stream().forEach(System.out::println);
		//l4.stream().forEach(System.out::println);

		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(10, Arrays.asList(new String[]{"history","math","geography"})));
		studentList.add(new Student(9, Arrays.asList(new String[]{"economics","biology"})));
		studentList.add(new Student(8, Arrays.asList(new String[]{"science","math"})));

		Set<String> ss = 
		studentList.stream()
		.map(Student :: getSubjects)
		.flatMap(Collection::stream)
		.collect(Collectors.toSet());
		
		List<String> ss1 = 
		studentList.stream()
			.flatMap(e -> e.getSubjects().stream())
			.distinct()
			.collect(Collectors.toList());
		
		
		ss1.stream().forEach(System.out::println);
		//ss.stream().forEach(System.out::println);
	}

}
