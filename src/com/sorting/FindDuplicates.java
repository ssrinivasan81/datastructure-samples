package com.sorting;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;
import com.sample.Student;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> lststud = Arrays.asList(
				new Student("srini","male",25),
				new Student("srini","male",26),
				new Student("vasan","male",27),
				new Student("vasan","female",28),
				new Student("kaviya","male",29),
				new Student("kaviya","male",30),
				new Student("varshini","male",35));	
		
		// To find duplicate Names
		// ---------------------------------------------------		
		List<String> duplist = lststud.stream().collect(Collectors.groupingBy(Student::getName , Collectors.counting()))
				.entrySet().stream().filter(item -> item.getValue() > 1 )
				.map(item -> item.getKey()).collect(Collectors.toList());
		
		// To find Number of occurences of Names in object
		// ---------------------------------------------------
		Map<String, Long> dupmap = lststud.stream().collect(Collectors.groupingBy(Student::getName , Collectors.counting()));
		
		dupmap.entrySet().forEach(item -> System.out.println(item.getKey() +" " + item.getValue()));
		System.out.println(duplist);
		
		
		// To find duplicate in Sorted Integer array
		// ---------------------------------------------
		int[] arr = {1,2,3,3,44,50,50,555555};
		int size = arr.length;
		int j=0;
		int k=0;
		for (int i=0;i<size-1;i++) {
			if (arr[i] != arr[i+1]) {
				arr[j++] = arr[i];		
			} else  {
				arr[k++] = arr[i];
			}
		}
		arr[j++] = arr[size-1];

		for (int i=0;i < k;i++) {
			System.out.println("arr[k]:"+ arr[i]);
		}
		for (int i=0; i<j; i++)  
	           System.out.print(arr[i]+" ");
		//------------------------------------------------------
		
		// To find duplicate in unsorted Integer array
		// -----------------------------------------------------
		System.out.println(" Duplicate in unsorted array :" );
		int[] unarr = {9,1,2,3,3,1,2,9,4,5};
		for (int i=0;i<unarr.length ;i++) {
			if ( unarr[Math.abs(unarr[i])] >= 0 ) {
				unarr[Math.abs(unarr[i])] = -unarr[Math.abs(unarr[i])];
			} else {
				System.out.print(" "+ Math.abs(unarr[i]));
			}
		}
		
        int[] iarr = {1,2,3,1,4,5,3};
        Integer[] inarr = ArrayUtils.toObject(iarr);
        Set<Integer> hset = new LinkedHashSet<Integer>(Arrays.asList(inarr));
                
        System.out.println("Without Dup:"+hset);    
		
        
       
	}

}
