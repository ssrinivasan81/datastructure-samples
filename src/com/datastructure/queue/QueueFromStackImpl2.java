package com.datastructure.queue;

import java.util.Stack;

public class QueueFromStackImpl2 {

	static class Queue {
		Stack<Integer> s1;
		Stack<Integer> s2;
	}
	
	static void enqueue (Queue q, int value) {
		push(q.s1, value);
	}
	static void push (Stack<Integer> topvalue, int value) {
		topvalue.push(value);
	}
	

	static int dequeue(Queue q) {
		
		if (q.s1.isEmpty() && q.s2.isEmpty()) {
			System.out.println("No Items in queue");
			System.exit(0);
		}
		
		if (q.s2.isEmpty()) {
			while (! q.s1.isEmpty()) {
				q.s2.push(q.s1.pop());
			}
		}
		
		return q.s2.pop();
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.s1 = new Stack<>();
		q.s2 = new Stack<>();
		
		enqueue(q, 10);
		enqueue(q, 12);
		enqueue(q, 13);
		enqueue(q, 14);
		
		System.out.println(dequeue(q));
		System.out.println(dequeue(q));
		System.out.println(dequeue(q));
		System.out.println(dequeue(q));
		
	}

}
