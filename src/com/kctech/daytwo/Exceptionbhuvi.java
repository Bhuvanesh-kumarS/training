package com.kctech.daytwo;

public class Exceptionbhuvi {
	public static void main(String args[])
	{
		try 
		{
			int data = 5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Can't divide by zero..");
	}

}
