package day2_flowControl;
import java.util.*;
import java.io.*;
import day2_flowControl.Author;

public class ans2 {
	
		Author authors[] = new Author[5];
		int size = 0;
		Scanner scn;
		Author a;
		String name;
		int id,nofbp;
		
		public ans2()
		{
			scn = new Scanner(System.in);
		}
		
		public void addAuthor(int author_id, String author_name, int no_of_books_published)
		{
			if(size >= 5)
			{
				System.out.println("Array is full.");
			}
			else
			{
				a = new Author(author_id, author_name, no_of_books_published);
				authors[size] = a;
				size++;
			}
		}
		
		public void updateAuthor(int author_id, String author_name, int no_of_books_published)
		{
			for(Author a : authors)
			{
				if(a.getAuthor_id() == author_id)
				{
					a.setAuthor_name(author_name);
					a.setNo_of_books_published(no_of_books_published);
				}
			}
		}
		
		public void getAllAuthors()
		{
			for(int i=0;i<authors.length;i++)
				System.out.println(authors[i]);
		}
		
		public void getAuthor(int author_id)
		{
			for(Author a : authors)
			{
				if(a.getAuthor_id() == author_id)
				{
					System.out.println(a);
					break;
				}
			}
		}
		
		public void removeAuthor(int author_id)
		{
			for(Author a : authors)
			{
				if(a.getAuthor_id() == author_id)
				{
					a.setAuthor_id(0);
					a.setAuthor_name("");
					a.setNo_of_books_published(0);
				}
			}
		}
	
		public void input(int operation)
		{
			if(operation == 1)
			{
				System.out.println("Enter Author Details : author_id ,name , number of books published");
				id=scn.nextInt();
				name=scn.next();
				nofbp=scn.nextInt();
				addAuthor(id,name,nofbp);
				getAuthor(id);
			}
			else if(operation == 2)
			{
				System.out.println("Enter Author Details : author_id , name , number of books published");
				id=scn.nextInt();
				name=scn.next();
				nofbp=scn.nextInt();
				updateAuthor(id, name, nofbp);
				getAuthor(id);
			}
			else if(operation == 3)
			{
				System.out.println("Enter author_id of an author to remove Details..");
				id=scn.nextInt();
				removeAuthor(id);
				getAllAuthors();
			}
			else if(operation == 5)
			{
				System.out.println("Enter author_id of an author to get Details..");
				id=scn.nextInt();
				getAuthor(id);
			}
		}
	
	
	
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			String input="";
			int ch;
			
			ans2 app=new ans2();
			do
			{
				System.out.println("1. Add New Author Details");
				System.out.println("2. Update Author Details");
				System.out.println("3. Remove Author Details");
				System.out.println("4. Get All Author Details");
				System.out.println("5. Get Author's Details");
				ch=sc.nextInt();
				
				switch(ch)
				{
					case 1:
						app.input(1);			
						break;
					case 2:
							app.input(2);
							break;
					case 3:
							app.input(3);
							break;
					case 4:
							app.getAllAuthors();
							break;
					case 5:
						app.input(5);
						break;
					default:
						System.out.println("Invalid Choice..");
							
				}
				
				System.out.println("Do you like to Perform more Operation ?(yes/no)");
				input=sc.next();
			}while(input.equalsIgnoreCase("yes"));
			
		}
}
