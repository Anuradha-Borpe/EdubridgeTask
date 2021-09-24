package com.exception;

public class EntryCheck {

	public static void CheckEntry(int age) throws EntryException
	{
		 if(age<18)
		 {
			 throw new EntryException("age is beloww 18");
		 }
		 else
		 {
			 System.out.println("Age is valid");
		 }
	}
	
	
	
	public static void main(String[] args) {
		
		try
		{
			CheckEntry(15);
		}
		catch(EntryException e)
		{
			System.out.println(e);
			System.out.println("Exception ocuurs");
		}

	}

}
