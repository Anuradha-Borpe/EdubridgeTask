package com.arraylist.collection;


import java.util.Vector;

public class VectorDemo  {
public static void main(String[] args) {
	Vector<Integer> v1=new Vector<Integer>();
	v1.add(123);
	v1.add(4560);
	v1.add(567);
	for(Integer v:v1)
	{
		System.out.println(v);
	}
}
}
