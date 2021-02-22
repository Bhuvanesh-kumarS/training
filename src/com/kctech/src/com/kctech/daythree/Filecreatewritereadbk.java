package com.kctech.daythree;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Filecreatewritereadbk {
	public static void main(String args[])
	{
		File file = new File("\\Users\\dineshnetaji\\Desktop\\bhuvibk.txt");
		try
		{
			file.createNewFile();
			FileWriter writer= new FileWriter(file);
			writer.write(50);
			writer.write("Hello bhuvi");
			writer.flush();
			writer.close();
			FileReader reader = new FileReader(file);
			char[] ch = new char[(int)file.length()];
			System.out.println(ch.length);	
			reader.read(ch);
			reader.close();
			for(char ch1: ch) 
				System.out.print(ch1);
			
		}
		catch(IOException e)
		{
	System.out.println(e);
		}
	}

}