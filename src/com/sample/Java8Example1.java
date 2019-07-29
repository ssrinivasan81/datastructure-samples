package com.sample;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class Java8Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = Arrays.asList("apple","banana","grapes","orange","papaya","grapes");
		
		List<String> go = lst.stream().filter(name -> name.startsWith("z")).collect(Collectors.toList());
		
		// Grouping By Example
		Map<String, Long> hmap = lst.stream().distinct().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));		
		Map<Character, String> tmap = lst.stream().distinct().collect(Collectors.toMap(s -> s.toString().charAt(0), s -> s));
		Map<String,Long> map = lst.stream().distinct().
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// Ends
		
		System.out.println("Tmap:"+tmap);
		System.out.println("--->"+go);
		System.out.println(map);
		
		List<Student> lststud = Arrays.asList(
				new Student("srini","male",25),
				new Student("srini","male",26),
				new Student("vasan","male",27),
				new Student("vasan","female",28),
				new Student("kaviya","male",29),
				new Student("kaviya","male",30),
				new Student("varshini","male",35));	
		
		// ToMap Example
		Map<Integer,String> chmap = lststud.stream().collect(Collectors.toMap(Student::getAge, Student::getName));	
		chmap.forEach((x,y) -> System.out.println(x +"  "+y));
		Map<String,List<Student>> mm = lststud.stream().collect(Collectors.groupingBy(Student::getName));
		// Ends
		
		Map<String, Set<String>> result = lststud.stream()
				.collect(
				Collectors.groupingBy(Student::getName, 
						Collectors.mapping( Student::getGender, Collectors.toSet())));
		
		/*
		 * Map<String, Long> map1 = lststud.stream().
		 * collect(Collectors.groupingBy(Student::getGender , Collectors.counting()));
		 */
		
		List<Student> pe = lststud.stream().sorted((Student s1, Student s2) -> {
			return (int) s1.getAge() - s2.getAge();
		}).collect(Collectors.toList());
		
		System.out.println(pe);
		System.out.println(mm);
		System.out.println("result;;"+result);
	}
		
}
