package com.arraylist.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo  {
	public static void main(String[] args) throws Exception{
		List list1=new ArrayList();
		list1.add(123);
		list1.add("anuradha");
		list1.add("darshan");
		//list1.add('a','b');
		//list1.add(0.5);
		 System.out.println(list1);
		 Iterator itr=list1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
		
	}

}
