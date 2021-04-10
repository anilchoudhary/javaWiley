/**
 * 
 */
package com.wiley.assessment;

import java.util.Scanner;

/**
 * @author Anil
 *
 */
public class Library {

	/**
	 * @param args
	 */
	static Scanner scn = new Scanner(System.in);
	Item[] record = new Item[10];
	private static int index = 0;
	static int id;
	static String title;
	static int noOfCopies;
	static String authorName;
	static int noOfPages;
	static String speakerName;
	static int duration;
	
	public void input(int operation)
	{
		if(operation == 1)
		{
			System.out.println("Enter book details: id, title, noOfCopies, authorName, noOfPages.");
			id = scn.nextInt();
			scn.nextLine();
			title = scn.nextLine();
			noOfCopies = scn.nextInt();
			scn.nextLine();
			authorName = scn.nextLine();
			noOfPages = scn.nextInt();
			
			record[index] = new Book(id, title, noOfCopies, authorName, noOfPages);
			index += 1;
			System.out.println("Book Added.");
		}
		else if(operation == 2)
		{
			System.out.println("Enter Journal Paper details: id, title, noOfCopies, authorName, noOfPages.");
			id = scn.nextInt();
			scn.nextLine();
			title = scn.nextLine();
			noOfCopies = scn.nextInt();
			scn.nextLine();
			authorName = scn.nextLine();
			noOfPages = scn.nextInt();
			record[index] = new JournalPaper(id, title, noOfCopies, authorName, noOfPages);
			index += 1;
			System.out.println("Journal Paper Added.");
		}
		else if(operation == 3)
		{
			System.out.println("Enter Video details: id, title, noOfCopies, speakerName, duration.");
			id = scn.nextInt();
			scn.nextLine();
			title = scn.nextLine();
			noOfCopies = scn.nextInt();
			scn.nextLine();
			speakerName = scn.nextLine();
			duration = scn.nextInt();
			record[index] = new Video(id, title, noOfCopies, speakerName, duration);
			index += 1;
			System.out.println("Video Added.");
		}
		else if(operation == 4)
		{
			System.out.println("Enter CD details: id, title, noOfCopies, speakerName, duration.");
			id = scn.nextInt();
			scn.nextLine();
			title = scn.nextLine();
			noOfCopies = scn.nextInt();
			scn.nextLine();
			speakerName = scn.nextLine();
			duration = scn.nextInt();
			record[index] = new CD(id, title, noOfCopies, speakerName, duration);
			index += 1;
			System.out.println("CD Added.");
		}
		else if(operation == 5)
		{
			for(int i=0;i<index;i++)
				System.out.println(record[i]);
		}
		else
		{
			System.out.println("Thanks for visiting the library.");		
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="";
		int ch;
		
		Library lib = new Library();
		
		do
		{
			
			if(index == 10)
				System.out.println("Library is Full. You can only see records.");
			
			System.out.println("1. Add Book");
			System.out.println("2. Add Journal Paper");
			System.out.println("3. Add Video ");
			System.out.println("4. Add CD");
			System.out.println("5. Show records");
			System.out.println("6. Exit");
			ch=scn.nextInt();
			
			switch(ch)
			{
				case 1:
					lib.input(1);			
					break;
				case 2:
						lib.input(2);
						break;
				case 3:
						lib.input(3);
						break;
				case 4:
						lib.input(4);
						break;
				case 5:
					lib.input(5);
					break;
				case 6:
					lib.input(6);
					break;
				default:
					System.out.println("Invalid Choice..");
						
			}
			
			System.out.println("Do you like to Perform more Operation ?(yes/no)");
			input=scn.next();
		}while(input.equalsIgnoreCase("yes"));
	}
}
