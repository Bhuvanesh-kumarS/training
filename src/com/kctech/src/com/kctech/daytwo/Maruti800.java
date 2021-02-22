package com.kctech.daytwo;

class Maruti8000 {
	public Maruti8000()
	{
		System.out.println("Class Car");
	}
	public void vehicletype()
	{
		System.out.println("Vehicle type:Car");
	}
}
class Maruti extends Maruti8000
{
	public Maruti()
	{
		System.out.println("Class Maruti");
	}
	public void brand()
	{
		System.out.println("Brand:Maruti");
	}
	public void speed()
	{
		System.out.println("Max speed:120kmph");
	}}
public class Maruti800 extends Maruti
{
	public Maruti800()
	{
		System.out.println("Maruti Model:800");
	}
	public void speed()
	{
		System.out.println("Max speed:130kmph");
	}
	public static void main(String args[])
	{
		Maruti800 obj=new Maruti800();
		obj.vehicletype();
		obj.brand();
		obj.speed();
	}
}