package com.kctech.daytwo;

interface Person
{
	void display();
}
class Student implements Person
{
	 public void display()
	 {
	System.out.println("Display method of student class");
}
}
class Lecturer implements Person
{
	public void display()
	{
		System.out.println("Display method of lecturer class");
	}
}
public class Abstractioninterfacebk {
     public static void main(String args[])
     {
     Person person1 = new Student();
     person1.display();
     Person person2 = new Lecturer();
     person2.display();
}
}
