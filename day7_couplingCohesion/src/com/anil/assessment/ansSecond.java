package com.anil.assessment;

import java.io.File;
import java.util.Scanner;

public class ansSecond {

		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the filename");
			String filename = sc.nextLine();
			File f1=new File(filename);
			
			if(f1.exists())
				System.out.println("File exists");
			else
				System.out.println("File does not exist");

			if(f1.isDirectory())
				System.out.println(filename + " is a directory");
			else
				System.out.println(filename + " is a file");

			if(f1.canRead())
				System.out.println(filename + " is readable");
			else
				System.out.println(filename + " can not be read");
			

			if(f1.canWrite())
				System.out.println(filename + " is writable ");
			else
				System.out.println(filename + " is not writable ");

			
			System.out.println("length of file in bytes:"+f1.length());	
	}

}
