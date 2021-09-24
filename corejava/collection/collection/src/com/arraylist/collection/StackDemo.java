package com.arraylist.collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	 Stack <String> s=new Stack<String>();
	 s.push("anuradha");
	 s.push("darshan");
	 s.push("0704");
	 s.push("happybirthday");
	
	  for(String s1:s)
	  {
		  System.out.println(s1);
	  }
	  s.pop();
	  for(String s1:s)
	  {
		  System.out.println(s1);
	  }
	  
}
}
