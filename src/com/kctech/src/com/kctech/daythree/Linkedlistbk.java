package com.kctech.daythree;
import java.util.*;
public class Linkedlistbk {
	public static void main(String args[])
	{
		LinkedList<String>al=new LinkedList<String>();
		al.add("hfjfj");
		al.add("hfsed");
		al.add("hfuhgj");
		al.add("klii");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
