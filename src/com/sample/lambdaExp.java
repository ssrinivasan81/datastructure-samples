package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambdaExp {

	static <T> Consumer<T> throwingConsumerWrapper(
			  ThrowingConsumer<T, Exception> throwingConsumer) {
			  
			    return i -> {
			        try {
			            throwingConsumer.accept(i);
			        } catch (Exception ex) {
			            throw new RuntimeException(ex);
			        }
			    };
			}
	static void validate(int age) throws Exception {
		if (age <= 0 )
			throw new MyException("Invalid Number.");
		System.out.println("S::"+5/age);
	}
	public static void main(String[] args) {
		try {
			validate(1);
		} catch (Exception e) {
			System.out.println("Exception Occured."+e);
		}
		// Samples for HashMap
		Map<Integer,String> hm = new HashMap();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		
		hm.forEach((key,value) -> System.out.println(key+"--"+value));		
		hm.entrySet().forEach(entry -> System.out.println(entry.getKey()+"--" +entry.getValue()));
		// Ends
		
		//Samples for comparator
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Tri","Male",37));
		student.add(new Student("Frini","Male",48));
		student.add(new Student("Srinivasan","Male",18));
		student.add(new Student("Srini","Male",18));

	
		
		Comparator<Student> comparator = Comparator.comparing(Student :: getAge);
		Student stumin = student.stream().min(comparator).get();
		//or
		Student stuminimum = student.stream().min(Comparator.comparing(Student::getName)).get();
		System.out.println("stuminimum.getName():"+stuminimum.getName());
		Student stumax = student.stream().max(comparator).get();


		
		
		  Comparator<Student> lstcomparator = (Student stu1, Student stu2) -> { return
		  (stu1.getName().compareTo(stu2.getName())); };
		  
		  
		  Comparator<Student> comp = (Student std1, Student std2) -> { return (int)
		  (std2.getAge() - std1.getAge()) ; };
		 
		
		Collections.sort(student, comp);
		student.forEach(System.out::println);
		System.out.println("---------****------------");
		
		Collections.sort(student, lstcomparator);
		student.forEach(System.out::println);
		System.out.println("---------****------------");
		
		String maxChar = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();
        System.out.println(maxChar);  
        System.out.println("---------------------");
        
        // Deletion based on name match
        student.removeIf(i -> i.getName().equalsIgnoreCase("Srinivasan"));        
        student.forEach(System.out::println);        				
        // Ends
        System.out.println("---------------------");
        
        // Comparison        
    	List<Student> studuplicate = new ArrayList<Student>();
		studuplicate.add(new Student("Tri1","Male",37));
		studuplicate.add(new Student("Frini1","Male",48));
		studuplicate.add(new Student("Srinivasan","Male",18));
		studuplicate.add(new Student("Srini","Male",18));
	
		

        // Ends
		
		List<Integer> integers = Arrays.asList(3, 9, 7, 50, 10, 20);	
		int sum1 = integers.stream().mapToInt(a -> a).sum(); 
		
		System.out.println(integers.stream().max(Comparator.comparingInt(Integer::valueOf)).get());
		
		int sum = integers.stream().collect(Collectors.summingInt(a -> a));
		System.out.println(sum1);
		
		int ff = integers.stream().filter(no -> no > 5).findFirst().get();
		System.out.println("Find FIrst:"+ff);
	
	}

}
