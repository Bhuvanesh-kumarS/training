package com.kctech.daythree;
import java.io.*;
import java.util.*;
public class Serializationdeserialbk {
	public static void main(String args[])
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("Ravi");
		al.add("Sk");
		al.add("Bk");
		try
		{
			FileOutputStream fos= new FileOutputStream("file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			FileInputStream fis= new FileInputStream("file");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList list=(ArrayList)ois.readObject();
			System.out.println(list);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

}
