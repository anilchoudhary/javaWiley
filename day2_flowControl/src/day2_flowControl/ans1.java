package day2_flowControl;
import java.util.*;
import java.io.*;

public class ans1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = n;
		
		if(n == 0 || n == 1)
			System.out.println(n + " is not an ugly number.");
		
		int flag = 0;
		while(n%2 == 0)
			n /= 2;
		if(n == 1)
			flag = 1;
		while(n%3 == 0)
			n /= 3;
		if(n == 1)
			flag = 1;
		while(n%5 == 0)
			n /= 5;
		if(n == 1)
			flag = 1;
		
		if(flag == 1)
			System.out.println(temp + " is an ugly number.");
		else 
			System.out.println(temp + " is not an ugly number.");
		scn.close();
	}

}
