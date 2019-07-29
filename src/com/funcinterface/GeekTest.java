package com.funcinterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Geek {
	public String name;
	public int id;
	
	Geek(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geek other = (Geek) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
}

public class GeekTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geek g1 = new Geek("ram", 1);
		Geek g2 = new Geek("ram", 1);
		
		System.out.println(g1.equals(g2));

		
		Map<Geek, String> map = new HashMap<>();
		map.put(g1, "ss");
		map.put(g2, "asd");
		
		System.out.println(map.size());
		
		Set<Geek> set = new HashSet<>();
		set.add(g1);
		set.add(g2);
		System.out.println(set.size());
		
		if (g1.hashCode() == g2.hashCode()) {
			if (g1.equals(g2)) {
				System.out.println("Both are equal");
			} else {
				System.out.println("Not equal");
			}
		} else {
			System.out.println("pepe");
		}
	}

}
