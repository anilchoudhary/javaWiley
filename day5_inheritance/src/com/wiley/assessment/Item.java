/**
 * 
 */
package com.wiley.assessment;

/**
 * @author Anil
 *
 */
public abstract class Item {

	private int id;
	private String title;
	private int noOfCopies;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the noOfCopies
	 */
	public int getNoOfCopies() {
		return noOfCopies;
	}
	/**
	 * @param noOfCopies the noOfCopies to set
	 */
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public Item() 
	{}
	
	public Item(int id, String title, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + noOfCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public void checkIn()
	{
		noOfCopies += 1;
	}
	
	public void checkOut()
	{
		noOfCopies -= 1;
	}
	
	public void addItem(int id, String title, int noc){
		setId(id);
		setTitle(title);
		setNoOfCopies(noc);
		}
	
	@Override
	public String toString() {
		return "[id=" + id + ", title=" + title + ", noOfCopies=" + noOfCopies + ",";
	}
	
	public void addItem()
	{
		noOfCopies += 1;
	}
}
