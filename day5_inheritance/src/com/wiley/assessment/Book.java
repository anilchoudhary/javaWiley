/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public class Book extends WrittenItem {

	/**
	 * 
	 */
	public Book(int id, String title, int noOfCopies, String authorName, int noOfPages) {
		super(id, title, noOfCopies, authorName, noOfPages);
		// TODO Auto-generated constructor stub
	}

	public Book() {
	}
	
//	@Override
//	public void addItem()
//	{
//		this.noOfCopies += 1;
//		System.out.println("One book added.");
//	}
	
//	static int id;
//	static String title;
//	static int noOfCopies;
//	static String authorName;
//	static int noOfPages;
//	
//	
//	
//	id = getId();
	
	
	@Override
	public String toString() {
		String temp = super.toString();
		return "Book " + temp;
	}
}
