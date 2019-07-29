package com.sample;

class parent {
	public void show() {
		System.out.println("parent show");
	}
	protected void m2() {
		System.out.println("parent m2");
	}
}
class child extends parent {
	public void show() {
		System.out.println("child show");
	}
	
	@Override
	public void m2() {
		System.out.println("child m2");
	}
}
public class OverrideConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		p.m2();
		p.show();
		parent p2 = new child();
		p2.show();
		p2.m2();
		
	}

}
