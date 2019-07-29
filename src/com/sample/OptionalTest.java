package com.sample;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		Optional<String> gender = Optional.of("Male");
		//Optional<String> gende = Optional.of(null);
		System.out.println(Optional.ofNullable(gender));
		System.out.println(gender.get());
		System.out.println(Optional.ofNullable(str).orElse("Yes"));
		
		
	}

}
