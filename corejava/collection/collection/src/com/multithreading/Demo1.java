package com.multithreading;

public class Demo1 extends Thread {
	@Override
	public void run()
	{
		//System.out.println("Hello");
		try {
			
			System.out.println("HIeee");
			sleep(10);
			System.out.println("Hello");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public static void main(String[] args) {
	Demo1 d=new Demo1();
	d.start();
	
}
}
