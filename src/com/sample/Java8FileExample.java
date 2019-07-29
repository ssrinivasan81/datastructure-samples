package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Java8FileExample {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(",");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(""));
			
			List<Student> lst = in
					.lines()
					.skip(1)
					.map(line -> {
						String[] arr = pattern.split(line);
						return new Student( arr[0] , arr[1] , Integer.parseInt(arr[2]))	;
					})
			.collect(Collectors.toList());
			
			System.out.println(lst);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
