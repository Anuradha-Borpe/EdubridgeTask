package com.map.collection;



@FunctionalInterface
public interface FunctionalDemo {
	
	 
 public  void MyMethod();
  default void second()
   {
	   System.out.println("Hello");
   }
  static void third()
  {
	  System.out.println("I am static");
  }
}
class MyFunctional implements FunctionalDemo
 {

	@Override
	public void MyMethod() {
		System.out.println("Hello Java");
	
		
	}
	 
	public static void main(String[] args) {
		 MyFunctional obj=new MyFunctional();
		 obj.MyMethod();
	     
	}
 }