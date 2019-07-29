package com.threadsamples;

public class EvenOddThread {

	public static void main(String[] args) {
	
		try {
			PrintEvenOdd eventhread = new PrintEvenOdd(1);
			PrintEvenOdd oddthread = new PrintEvenOdd(0);
			
			Thread t1 = new Thread(eventhread,"Thread1");
			Thread t2 = new Thread(oddthread, "Thread2");
			
			t1.start();
			t2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}


class PrintEvenOdd implements Runnable {
	
	int remainder;
	int MAX = 10;
	static int count = 1;
	static Object lock = new Object();
	
	PrintEvenOdd (int remainder) {
		this.remainder = remainder;
	}
	@Override
	public void run() {
		while (count < MAX) {
			synchronized (lock) {
				while (count % 2 != remainder) {					
					try {
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					} 					
				}
				System.out.println(Thread.currentThread().getName() + " -->  " + count);
				count ++;
				lock.notifyAll();
			}			
		}
	}

}

