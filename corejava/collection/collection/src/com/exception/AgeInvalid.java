package com.exception;

public class AgeInvalid {

	public static void AgeInvalid(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Age is not valid");
		}
		else
		{
			System.out.println("Age is valid");
		}
	}
	
	public static void main(String[] args) {
		try {
			AgeInvalid(15);
		}
		catch(MyException e)
		{
			System.out.println(e);
			System.out.println("Exception occurs");
		}
	}
	
}
