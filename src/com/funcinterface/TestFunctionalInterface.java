package com.funcinterface;

import java.util.function.Function;

@FunctionalInterface
public interface TestFunctionalInterface {
	
	public void show();
	
	Function<String, TestFunctionalInterface> selectObject =  brandcode ->
	{
		if ("Nissan" .equalsIgnoreCase(brandcode)) {
			return new TestNissan();
		} else if ("Renault" .equalsIgnoreCase(brandcode)) {
			return new TestRenault();
		} else {
            throw new IllegalArgumentException("No Production Plan CSV Reader is implemented for this brand: "+ brandcode);
        }
	};
	
	default String display() {
		System.out.println("This is default method..");
		return "Srinivasan";
	}
	
	default int showcase(int i) {
		return i*i;		
	}
}
