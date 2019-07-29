package com.sample;

class Test<T> {
	T obj;
	Test(T obj) {
		this.obj = obj;		
	}
	public T getObject(T obj) {
		return this.obj;
	}
}
public class Stringrev {

	
	public static void main(String[] args) {
		
		Test obj = new Test<Integer>(22);
		System.out.println(obj.getObject(obj));
		
		Test obj1 = new Test<String>("Test");
		System.out.println(obj1.getObject(obj1));
		
		String s1= "Srini";
		s1.concat("Srinivasan");// Immuatable
		
		String s2 = new String("abc");
		s2.concat("asdfasdf");
		
		System.out.println(s2);
		System.out.println(s1);
		// TODO Auto-generated method stub
		String strrev = "Geeks for Gkkeeks";
		
		int left = 0;
		int right = strrev.length() - 1;
		char[] charl = strrev.toCharArray();
		
		for (left = 0; left < right; left++, right --) {
			char temp = charl[left];
			charl[left] = charl[right]; 
			charl[right] = temp;
		}
		
		for (char c : charl) {
			System.out.print(c);
		}
	}

}
