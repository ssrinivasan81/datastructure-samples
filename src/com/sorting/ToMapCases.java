package com.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sample.Student;

public class ToMapCases {

	// Convert Student list to Map 
	public static void main(String[] args) {
		List<Student> lststud = Arrays.asList(
				new Student("srini","male",25),
				new Student("srini","male",26),
				new Student("vasan","male",27),
				new Student("vasan","female",28),
				new Student("kaviya","male",29),
				new Student("kaviya","male",30),
				new Student("varshini","male",35));			

		// Get distinct object and convert list to Map
		// ------------------------------------------------------------
		Map<String , Integer> hmap = lststud.stream()
				.filter( distinctKey(item -> item.getName()))
				.collect(Collectors.toMap( Student::getName , Student::getAge));


		// Get distinct object and convert list<Student> object to list<String>
		// ---------------------------------------------------------------------
		List<String> ll = lststud.stream().filter(distinctKey(i -> i.getName())).map(Student::getName).collect(Collectors.toList());
				
		System.out.println(ll);
		hmap.entrySet().forEach(item -> System.out.println(item.getKey() +" " + item.getValue()));		
	}
	
	private static <T> Predicate<T> distinctKey(Function<? super T, ?> keyExtractor) {
		Map<Object,Boolean> seen = new ConcurrentHashMap<>();
		return t->seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

}
