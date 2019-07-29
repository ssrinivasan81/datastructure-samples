package com.datastructure;

import java.util.Comparator;
import java.util.PriorityQueue;

	class KeyComparator implements Comparator<Key> {
		public int compare(Key k1, Key k2) {
			if (k1.freq < k2.freq) {
				return 1;				
			} else if (k1.freq > k2.freq) {
				return -1;
			} else {
				return 0;
			}			
		}
	}	
	
	class Key {
		int freq;
		char ch;
		
		Key(int val, char c) {
			freq =  val;
			ch = c;
		}
	}
	public class RearrangeCharacter {
	
		static int MAX_CHAR = 26; 
		static void reArrangeWords(String str) {
			
			
			int _slength = str.length();
			int[] count = new int[MAX_CHAR]; 
			
			for (int i=0;i< _slength; i++) {				
				count[str.charAt(i) - 'a'] ++;
			}
			
			PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());
			
			for (char c = 'a' ;c< 'z' ; c++) {
				int val = c - 'a';
				int vall = c;
				int valb = 'a';
				System.out.println("Val->"+vall +"<><><>"+vall+"<><><>"+val);
				if (count[val] > 0) {					
					pq.add(new Key(count[val], c)); 
				}
			}
			
			System.out.println(pq);
			str = "";
			Key prev = new Key(-1, '#');
			
			while (pq.size() != 0) {
				Key k = pq.peek();
				pq.poll();
				
				str += k.ch;
				
				if (prev.freq > 0) {
					pq.add(prev);
				}
				
				(k.freq) --;
				prev = k;
			
			}
			
			if (_slength != str.length()) 
                System.out.println(" Not valid String "); 
            else
                System.out.println(str); 
		}
		
		
		public static void main(String[] args) {			
			String rearrangeChar = "abbaaa";
			reArrangeWords(rearrangeChar);
		}
	
	}
