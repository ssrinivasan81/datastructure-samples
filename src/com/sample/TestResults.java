package com.sample;

import java.util.stream.*;


import static java.util.stream.Collectors.toList;

import java.util.*;

public class TestResults
{
    public static class Student {
        private String name;
        private int score;
        
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        public int getScore() {
            return score;
        }
        
        public String getName() {
            return name;
        }
    }
    
    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");	

    	return students
    		.filter(item -> item.getScore() >= passingScore)
    		.sorted(Comparator.comparing(Student::getScore).reversed())
    		.map(item -> item.getName())
    		.collect(Collectors.toList());		
    	
    }
    
   
    public static void main(String[] args) {        
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));
        students.add(new Student("Mik1e", 90));
        students.add(new Student("Ja4mes", 51));
        students.add(new Student("Alan", 100));        
        
        studentsThatPass(students.stream(), 50).forEach(System.out::println);        
    }
}
