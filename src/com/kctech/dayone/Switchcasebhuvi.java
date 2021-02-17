package com.kctech.dayone;
import java.util.Scanner;

public class Switchcasebhuvi {
	public static void main(String args[])
	{
		System.out.println("Enter the rollno:");
		Scanner s = new Scanner(System.in);
		int rollno = s.nextInt();
		String nameString;
		switch(rollno)
		{
		case 1:
			nameString = "Gokul";
			break;
		case 2:
			nameString = "Suresh";
			break;
		case 3:
			nameString = "Bhuvi";
			break;
		case 4:
			nameString = "Siva";
			break;
			default:
				nameString = "Invalid Name";
		
		}
		System.out.println(nameString);
		}
	}


