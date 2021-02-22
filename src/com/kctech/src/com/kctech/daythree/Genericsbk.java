package com.kctech.daythree;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericsbk {
	public static void main(String args[])
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("bhj");
		list.add("dfg");
		list.add("drf");
		list.add("sdf");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
