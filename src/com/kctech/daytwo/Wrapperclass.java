package com.kctech.daytwo;

public class Wrapperclass 
{
	public static void main(String args[])
	
	{
		byte a = 1;
		Byte byteobj=new Byte(a);
		int b=20;
		Integer intobj=new Integer(b);
		float c=18.6f;
		Float floatobj=new Float(c);
		System.out.println("Value of wrapper objects(printing as objects)");
		System.out.println("Byte object byteobj:"+byteobj);
		System.out.println("Integer object intobj"+intobj);
		System.out.println("Float object floatobj"+floatobj);
		byte bv = byteobj;
		int iv = intobj;
		float fv =floatobj;
		System.out.println("unwrapped values(printing as datatypes)");
		System.out.println("byte value, bv:"+bv);
		System.out.println("int value, iv:"+iv);
		System.out.println("float value, fv:"+fv);
	}

}
