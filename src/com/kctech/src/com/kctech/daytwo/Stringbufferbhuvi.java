package com.kctech.daytwo;

public class Stringbufferbhuvi {
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("Bhuvi");
		int a= s.length();
		int b= s.capacity();
		s.append("bhuvi");
		System.out.println("Length of string bhuvi:"+a);
		System.out.println("capacity of string bhuvi:"+b);
		System.out.println(s);
	}
}
