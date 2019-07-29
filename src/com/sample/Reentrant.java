package com.sample;

public class Reentrant {

	class Reentrantexample {
		public synchronized void m() {
			n();
			System.out.println("M method");
		}
		
		public synchronized void n() {
			System.out.println("N method");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final Reentrant reentrant = new Reentrant();
		Thread t1 = new Thread() {
		//public void run() {
			//reentrant.m();
		//}
		};
		t1.start();
	}

}
