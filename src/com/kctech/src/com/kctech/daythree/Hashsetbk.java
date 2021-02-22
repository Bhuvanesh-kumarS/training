package com.kctech.daythree;
import java.util.*;
public class Hashsetbk {
	public static void main(String args[])
	{
		HashSet<String>set=new HashSet<String>();
		set.add("hgj");
		set.add("def");
		set.add("abc");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
