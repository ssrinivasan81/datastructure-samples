package com.funcinterface;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSample extends Thread {
	
	static ConcurrentHashMap<Integer,String> l = new ConcurrentHashMap<Integer,String>(); 
	
	public void run() {
		try
        { 
            l.put(103, "D");
			Thread.sleep(1000); 
        } 
        catch(InterruptedException e) 
        { 
            System.out.println("Child Thread going to add element"); 
        }
	}
	public static void main(String[] args)  {
		l.put(100,"A"); 
        l.put(101,"B"); 
        l.put(102,"C"); 
        
        HashMapSample t = new HashMapSample();		
		t.start();
		
		try {
			for (Object o : l.entrySet())  
	        { 
	            Object s=o; 
	            System.out.println(s); 
	            Thread.sleep(1000); 
	        } 
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		l.entrySet().forEach(item -> System.out.println(item.getKey()));
	}
}
