/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public abstract class MediaItem extends Item {
	private String speakerName;
	private int duration;
	/**
	 * @return the speakerName
	 */
	public String getSpeakerName() {
		return speakerName;
	}
	/**
	 * @param speakerName the speakerName to set
	 */
	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public MediaItem()
	{}
	
	/**
	 * @param speakerName
	 * @param duration
	 */
	public MediaItem(int id, String title, int noOfCopies, String speakerName, int duration) {
		super(id, title, noOfCopies);
		this.speakerName = speakerName;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		String temp1 = super.toString();
		String temp2 = " speakerName=" + speakerName + ", duration=" + duration + "]";
		return temp1 + temp2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((speakerName == null) ? 0 : speakerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaItem other = (MediaItem) obj;
		if (duration != other.duration)
			return false;
		if (speakerName == null) {
			if (other.speakerName != null)
				return false;
		} else if (!speakerName.equals(other.speakerName))
			return false;
		return true;
	}	
}
