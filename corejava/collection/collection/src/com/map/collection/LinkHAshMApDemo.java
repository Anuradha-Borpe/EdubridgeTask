package com.map.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHAshMApDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hs=new LinkedHashMap<Integer,String>();
		//hs.put(1, "anuradha");
		hs.put(1, "anu");
		hs.put(2, "Darsh");
		hs.put(3, "pooja");
		hs.put(4, null);
		hs.put(null, "anu");
		hs.put(null, "abc");
		hs.put(null, "abc");
		hs.put(null, "abc");
		for(Map.Entry m:hs.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
