package com.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.Student;

public class SortArraylistCases {

	public static void main(String[] args) {
		List<Student> lststud = Arrays.asList(
				new Student("srini","male",25),
				new Student("srini","male",26),
				new Student("vasan","male",27),
				new Student("vasan","female",28),
				new Student("kaviya","male",29),
				new Student("kaviya","male",30),
				new Student("varshini","male",35));	
		
		// Object sorting
		// ----------------------------------------------------------
		
		// Sort based on AGE		
		// ----------------------------------------------------------
		List<Student> aftersort = lststud.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		
		// Reverse sort
		// ----------------------------------------------------------
		List<Student> reversesort = lststud.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());

		//Alternate Method - without using Comparator
		// ----------------------------------------------------------
		List<Student> sortm1 = lststud.stream().sorted( (Student s1, Student s2) -> {
			return (int) s1.getAge() - s2.getAge();
			// return (int) s2.getAge() - s2.getAge() (or) use compareTo method
 		}).collect(Collectors.toList());
		
		//After sorting, i want only student names.
		// ----------------------------------------------------------
		List<String> nlist = lststud.stream()
									.sorted(Comparator.comparing(Student::getAge))
									.map(Student::getName)
									.collect(Collectors.toList());
		
		// Based on Sorting, get Maximum and Minimum.
		// ----------------------------------------------------------
		Student stumax = aftersort.stream().max(Comparator.comparing(Student::getAge)).get();
		Student stumin = aftersort.stream().min(Comparator.comparing(Student::getAge)).get();
		
		// Number Sorting
		// ----------------------------------------------------------
		List<Integer> ilist = Arrays.asList(3,5,80,34);
		List<Integer> slist = ilist.stream().sorted(Comparator.comparingInt(item -> item)).collect(Collectors.toList());
		
		// String Sorting
		// ----------------------------------------------------------
		List<String> strsort = Arrays.asList("test","srini","applite","mango");
		List<String> strlist = strsort.stream().sorted(Comparator.comparing(item -> item)).collect(Collectors.toList());
				
		System.out.println("AFter sort 1:"+aftersort);
		System.out.println("AFter reverse sort 1:"+reversesort);
		System.out.println("sort method1:"+sortm1);
		System.out.println("sort only names:"+nlist);
		System.out.println("Get max:"+stumax.getName());
		System.out.println("Get min:"+stumin.getName());
		System.out.println("Sorted Integer:"+slist);
		System.out.println("Sorted String:"+strlist);
		
	}

}
