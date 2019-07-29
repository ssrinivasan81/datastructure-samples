package com.sample;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ElasticData {

	private static String rightpad(String text, int length) {
		if (text.length() < length) {
			for (int i = text.length(); i < length; i++)
				text += " ";	       
		}
	    return text;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubst
		List<Person> personlst = new ArrayList<>(); 
		for (int i=0;i<100;i++) {
			personlst.add(new Person("P0"+i,"AUSTRIA"+i,"ZOE"+i,"","",""));
		}
		
		List<Student> studentlst = new ArrayList<>();
		studentlst.add(new Student("P10","AUSTRIA0",1));
		studentlst.add(new Student("P067","AUSTRIA67",2));
		
		System.out.println("personlst"+personlst.size());
		
		List removed = personlst
					.stream()
					.filter(
							o1 -> studentlst
									.stream()
									.anyMatch(
											o2 -> 	o2.getName().equalsIgnoreCase(o1.getName()) &&
													o2.getGender().equalsIgnoreCase(o1.getGender()) 
											)
							)
					.collect(Collectors.toList());
		
		for (int i=0;i<removed.size();i++) {
			Person person = (Person)removed.get(i);
			
			System.out.println(person.getName() + "**" + person.getGender() + "**" + person.getAge());
		}
		
		
		// create 2 BigDecimal Objects
	      BigDecimal bg1  = new BigDecimal("1.550");
	      BigDecimal scaled = bg1.setScale(0, RoundingMode.HALF_UP);
	      
	      MathContext mc = new MathContext(4); // 3 precision

	      // bg1 is rounded using mc
	     
	      System.out.println("The value " +  scaled) ;
	     System.out.println("The value " +  bg1.round(mc)) ;
	     
	     Optional<String> ss = Optional.of("ss");
	     String str = rightpad("",12);
	     System.out.println(str.length());
	     System.out.println(ss.get());
	      
		/*List<ObjOne> removed = list.stream().filter(o1 -> list2.stream().noneMatch(o2 -> o2.getId().equals(o1.getId())))
	            .collect(Collectors.toList());
	    System.out.print("added ");
	    removed.forEach(System.out::println);

	    List<ObjTwo> added = list2.stream().filter(o1 -> list.stream().noneMatch(o2 -> o2.getId().equals(o1.getId())))
	             .collect(Collectors.toList());

	    System.out.print("removed ");
	    added.forEach(System.out::println);
*/	    
	    
	}

}
