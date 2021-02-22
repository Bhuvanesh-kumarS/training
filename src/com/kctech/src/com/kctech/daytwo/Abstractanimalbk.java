package com.kctech.daytwo;

abstract class Abstractanimalbk {
	abstract void sound();
}
 class Dog extends Abstractanimalbk
{
	public void sound()
	{
		System.out.println("woof");
	}
	public static void main(String args[])
	{
		Abstractanimalbk obj = new Dog();
		obj.sound();
	}
}
