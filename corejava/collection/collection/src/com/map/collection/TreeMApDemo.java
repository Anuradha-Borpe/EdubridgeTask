package com.map.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMApDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");
	      map.remove(102);
	      
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	}

}
