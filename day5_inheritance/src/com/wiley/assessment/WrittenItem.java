/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public abstract class WrittenItem extends Item {
	private String authorName;
	private int noOfPages;
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return the noOfPages
	 */
	public int getNoOfPages() {
		return noOfPages;
	}
	/**
	 * @param noOfPages the noOfPages to set
	 */
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	@Override
	public String toString() {
		String temp1 = super.toString();
		String temp2 = " authorName=" + authorName + ", noOfPages=" + noOfPages + "]";
		return temp1 + temp2;
	}
	
	public WrittenItem()
	{}
	
	/**
	 * @param authorName
	 * @param noOfPages
	 */
	public WrittenItem(int id, String title, int noOfCopies, String authorName, int noOfPages) {
		super(id, title, noOfCopies);
		this.authorName = authorName;
		this.noOfPages = noOfPages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + noOfPages;
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
		WrittenItem other = (WrittenItem) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (noOfPages != other.noOfPages)
			return false;
		return true;
	}
}
