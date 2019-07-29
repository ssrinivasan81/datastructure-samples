package com.datastructure.queue;

import java.util.Stack;

public class QueueFromStackImpl {
	
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
	
	public void enqueue(int val) {	
		
		while (! s1.isEmpty()) {
			s2.push(s1.pop());			
		} 
		
		
		s1.push(val);
	
		while (! s2.isEmpty()) {
			s1.push(s2.pop());
		}		
	}
	
	public void dequeue() {
		if ( s1.isEmpty()) {
			System.out.println("Empty Queue");
			System.exit(0);
		}
		
		System.out.println("Value:"+s1.peek());
		s1.pop();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueFromStackImpl q = new QueueFromStackImpl();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}

}
