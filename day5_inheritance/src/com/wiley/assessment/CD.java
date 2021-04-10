/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public class CD extends MediaItem {

	
	public CD()
	{
		
	}
	
	public CD(int id, String title, int noOfCopies, String speakerName, int duration) {
		super(id, title, noOfCopies, speakerName, duration);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		return "CD " + temp;
	}
}
