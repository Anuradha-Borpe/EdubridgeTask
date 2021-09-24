package com.set.collection;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		
	
	HashSet<String> set=new HashSet<String>();  
	set.add("Ravi");  
	set.add("Vijay");  
	set.add("Ravi");  
	set.add("Ajay");
	set.add("anu");
	set.add(null);
	set.add(null);
	for(String str:set)
	{
		System.out.println(str);
	}
}
}