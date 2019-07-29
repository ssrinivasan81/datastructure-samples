package com.sample;

public class FunctionalInterfaceImpl implements Shapes {
	
	public int square(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		Shapes ss = (int x) -> x*x;
		int a = ss.square(5);
		System.out.println(a);
	}
}