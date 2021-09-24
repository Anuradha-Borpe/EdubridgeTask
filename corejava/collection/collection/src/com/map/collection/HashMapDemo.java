package com.map.collection;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
		Map <Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1, "anu");
		hs.put(2, "Darsh");
		hs.put(3, "pooja");
		hs.put(4, null);
		hs.put(null, "anu");
		hs.put(null, "abc");
		hs.put(null, "abc");
		hs.put(null, "abc");
		System.out.println(hs);
		
		
		for(Map.Entry m:hs.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
