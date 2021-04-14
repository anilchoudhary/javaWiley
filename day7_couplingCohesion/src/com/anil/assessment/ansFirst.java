package com.anil.assessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ansFirst {
		public static void main(String args[])throws IOException
	    {
				Scanner scn = new Scanner(System.in);        
				int lineNo = 1;
		        char ch;
	                
	                System.out.print("Write your file name: ");
	                
	                String str=scn.next();
	                FileInputStream f=new FileInputStream(str);
	                
	                System.out.println("Content present in file are: ");
	                
	                int n=f.available();
	                
	                System.out.print(lineNo + ". ");
	                for(int i=0;i<n;i++)
	                {
	                            ch=(char)f.read();
	                            System.out.print(ch);
	                            if(ch == '\n')
	                            {
	                                        System.out.print(++lineNo+": ");
	                                       
	                            }
	                                       
	                }
	                f=new FileInputStream(str);
	                int num_lines = 1;
	        		int num_words = 0;
	        		for(int i=0;i<n;i++)
	                {
	                            ch=(char)f.read();
	                            if(ch=='\n')
	                            	num_lines++;
	                            else if(ch==' ')
	                            	num_words++;
	                                                               
	                }
	                System.out.println("\nNumber of lines : "+num_lines);
	                System.out.println("\nNumber of words : "+(num_lines+num_words));
	                System.out.println("\nNumber of characters : "+n);
	    }
}
//C:\Users\Anil\git\javaWiley\day7_couplingCohesion\src\com\anil\assessment
