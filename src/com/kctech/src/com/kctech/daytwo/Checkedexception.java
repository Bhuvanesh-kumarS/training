package com.kctech.daytwo;
import java.io.*;

class Checkedexception {
	public static void main(String args[])
	{
	FileReader file = new FileReader("c:\\Users\\dineshnetaji\\Desktop\\bhuvi.rtf");
	BufferedReader fileInput=new BufferedReader(file);
	for(int count = 0;count<3;count++);
	System.out.println(fileInput.readLine());
	fileInput.close();
	}
}
