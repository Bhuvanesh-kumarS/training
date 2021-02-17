package com.kctech.daytwo;
import java.io.IOException;

public class Throwsbhuvi {
	void m()throws IOException
	{
		throw new IOException("Device Errror");
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		}
		public static void main(String args[])
		{
			Throwsbhuvi obj=new Throwsbhuvi();
			obj.p();
			System.out.println("normal flow..");
		}
	}

