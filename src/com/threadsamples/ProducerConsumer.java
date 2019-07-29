package com.threadsamples;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		BlockingQueue<Integer> bQueue = new LinkedBlockingQueue<Integer>();
		
		Producer producer = new Producer(bQueue);
		Consumer consumer = new Consumer(bQueue);
		
		producer.start();
		consumer.start();		
	}
}

class Producer extends Thread {
	BlockingQueue<Integer> sQueue = new LinkedBlockingQueue<Integer>();
	
	Producer(BlockingQueue<Integer> bQueue) {
		super("PRODUCER");
		this.sQueue = bQueue;
	}
	public void run() {
		for (int i=0;i<10;i++) {
			try {
				sQueue.put(i);
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
						
		}
	}
}

class Consumer extends Thread {
	BlockingQueue<Integer> sQueue = new LinkedBlockingQueue<Integer>();
	
	Consumer(BlockingQueue<Integer> bQueue) {
		super("CONSUMER");
		this.sQueue = bQueue;
	}
	public void run() {
		try {
			while( true ) {
				System.out.println("Result:"+sQueue.take());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
