package com.anil.assessment;

import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ansThird {
	public static boolean isValid(String UserName) {  
	         
			
			int len = UserName.length();
			String part1= UserName.substring(0, len-4);
			String part2 = UserName.substring(len-4, len);
			
			if(part2.equals("_job") && part1.length()>=8) {
				return true;
			}
			else return false;
	    }  
	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			Scanner input = new Scanner(System.in);  
	        System.out.print("Please enter a Username : ");  
	        String Username = input.next();  
	        
//	        FileWriter fw=new FileWriter("charData.txt");
//	        File f1=new File("charData.txt");
//	        if(f1.exists())
//				System.out.println("File exists");
//			else
//				System.out.println("File does not exist");
	        
	        if (isValid(Username)) {  
	            System.out.println("Valid Username");  
	            try{    
		            FileWriter fw=new FileWriter("charData.txt");    
		            fw.write(Username);    
		            fw.close();    
		           }catch(Exception e){System.out.println(e);}
	        } else {  
	            System.out.println("Invalid Username");  
	        }  
	        
	        
	        
	        
//	        FileReader fr=new FileReader("charData.txt");
//			
//			while(fr.read()!=-1) // i<arr.length =A EOF =-1
//			{
//				System.out.println("CHAR : "+(char)fr.read());
//			}
	        
	        File file=new File("charData.txt");
			byte b[]=new byte[100];
			FileInputStream fis=new FileInputStream(file);
			fis.read(b);
			System.out.println(new String(b));
	
		}
}
