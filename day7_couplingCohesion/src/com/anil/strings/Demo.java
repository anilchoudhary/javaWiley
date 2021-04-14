package com.anil.strings;

import java.io.*;
import java.util.*;


public class Demo {
		public static void main(String[] s)
		{
			String s1 = new String("abc");
			
			String s2 = new String(s1);
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		}
}
