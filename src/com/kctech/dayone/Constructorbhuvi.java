package com.kctech.dayone;

public class Constructorbhuvi {
	String name;
	int age;
	Constructorbhuvi(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	}
class Bhuvi
{
	
	public static void main(String args[])
	{
	Constructorbhuvi obj = new Constructorbhuvi("Bhuvi",23);
	System.out.println("Your Name:"+obj.name +"Your Age:"+obj.age);
	}
}
