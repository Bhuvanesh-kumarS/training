package com.kctech.daythree;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class Hashmapbk {
	public static void main(String args[])
	{
		HashMap hm = new HashMap();
		hm.put("Bhuvi",100);
		hm.put("Siva",30);
		hm.put("Abu",50);
	System.out.println(hm);
	Set s=hm.keySet();//To print only the keys
	System.out.println("keys are"+s);
	Collection c=hm.values();//to print only the values
	System.out.println("values are"+c);
	
	}

}
