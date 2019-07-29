package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
		
		Predicate<Integer> evenfun = (a) -> a%2 == 0;		
		Predicate<Integer> oddfun = evenfun.negate();
		
		int summ = lst.stream().mapToInt(a -> a).sum();
		
		int evensum = lst.stream().filter( evenfun ).mapToInt((a) -> a).sum();
		int oddsum = lst.stream().filter(oddfun).mapToInt( (a) -> a).sum(); 
		// (OR)
		int oddsumm = lst.stream().filter(evenfun.negate()).mapToInt( (a) -> a).sum();
		
		System.out.println(evensum);
		System.out.println(oddsum);
		System.out.println(oddsumm);
		System.out.println(summ);		
	}

}
