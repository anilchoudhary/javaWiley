/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public class Video extends MediaItem {
	
	public Video()
	{
		
	}
	
	public Video(int id, String title, int noOfCopies, String speakerName, int duration) {
		super(id, title, noOfCopies, speakerName, duration);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		return "Video " + temp;
	}

}
