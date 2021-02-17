package com.kctech.daytwo;

public class Varagsbhuvi {
	static void var(int ...a)
	{
		System.out.println("Number of arguments:"+a.length);
		for(int i:a)
			System.out.print(i+"");
		System.out.println();
		}
	public static void main(String args[])
	{
		var(100);
		var(1,2,3,4);
		var();
	}
	

}
