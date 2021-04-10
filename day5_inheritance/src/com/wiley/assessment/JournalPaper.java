/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public class JournalPaper extends WrittenItem {

	/**
	 * 
	 */
	public JournalPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(int id, String title, int noOfCopies, String authorName, int noOfPages) {
		super(id, title, noOfCopies, authorName, noOfPages);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		return "Journal Paper " + temp;
	}
	
}
