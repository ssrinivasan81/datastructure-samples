package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindList {

	public static void main(String... args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(11);
		list.add(13);
		System.out.println(sum(list));
		list.stream().filter(i -> i > 10).reduce(0, Integer::sum);
		Map<Integer,Integer> map=list.stream().collect(Collectors.toMap(i->i, i->1+i));
		System.out.println(map);
		
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		System.out.println(sum);
		
		int[] a= {3,5,8};
		a[1]=7;
		int[] b = a;
		try {
			System.out.println("a:"+a[0] +" "+ a[1] +" "+a[2]);
			System.out.println("b:"+b[0] +" "+ b[1] +" "+b[2]);			
		} finally {
			System.out.println("Inside finally");
		}

	}
	public static int sum(List<Integer> list) {
		return list.stream().filter(i -> i > 10).reduce(0, Integer::sum);
	}

}
