package com.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Entry {
    List<String> lst = new ArrayList<>();
    Map<String,String> map = new LinkedHashMap<>(); 
    Queue<String> queue = new PriorityQueue<>();
    public void enter(String passportNumber) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        lst.add(passportNumber);     
        //map.put(passportNumber, passportNumber);
        queue.add(passportNumber);
        
    }

    public String leave() {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	
		/*
		 * System.out.println(map.size()); String val = map.get(map.size() - 1).;
		 * 
		 * System.out.println(val); return val;
		 */
    	System.out.println("q:"+queue.poll());
    	queue.peek();
    	String output = null;
    	if (lst.size() > 0 ) {
            output = lst.get(0);
            lst.remove(0);
            
        } 
    	return output;
    }
    
    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.enter("AB54321");
        entry.enter("UK32032");
        System.out.println(entry.leave());
        System.out.println(entry.leave());
    }
}
