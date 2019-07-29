package com.funcinterface;

import static com.funcinterface.TestFunctionalInterface.selectObject;
public class DoingFunctionalClass {

	public static void main(String[] args) {
		selectObject.apply("Nissan").show();		
		System.out.println(selectObject.apply("Nissan").display());
		
		System.out.println(selectObject.apply("Nissan").showcase(10));
	}

}
