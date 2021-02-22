package com.kctech.daythree;

import java.util.*;

public class Linkedhashmapbk {
	public static void main(String args[])
	{
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
	lhm.put("one","hfgj");
	lhm.put("two","hfj");
	lhm.put("three","dgh");
	System.out.println(lhm);
	System.out.println("Getting value for key 'one':"+lhm.get("one"));
	System.out.println("Size of the map:"+lhm.size());
	System.out.println("Is map empty?"+lhm.isEmpty());
	System.out.println("Contains key 'two'?"+lhm.containsKey("two"));
}	
}
