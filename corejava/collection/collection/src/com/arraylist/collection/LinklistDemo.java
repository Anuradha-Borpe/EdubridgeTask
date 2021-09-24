package com.arraylist.collection;

import java.util.LinkedList;
import java.util.List;

public class LinklistDemo {
public static void main(String[] args) {
	List<String> list2=new LinkedList<String>();
	list2.add("anu");
	list2.add("darshan");
	list2.add("1234");
	 
	for(String l1:list2)
	{
		System.out.println(l1);
	}
}
}
