package com.kctech.daytwo;

class Addition{
	static int Add(int a,int b)
	{
		return a+b;
	}
static double Add(double a,double b)
{
	return a+b;
}
}
class Methodoverloading
{
	public static void main(String args[])
	{
		System.out.println(Addition.Add(2, 6));
		System.out.println(Addition.Add(2.3, 5.7));
	}
}
