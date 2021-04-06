package day2_flowControl;

public class Author
{
	private int author_id;
	private String author_name;
	private int no_of_books_published;

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getNo_of_books_published() {
		return no_of_books_published;
	}

	public void setNo_of_books_published(int no_of_books_published) {
		this.no_of_books_published = no_of_books_published;
	}
	
	public Author(int author_id, String author_name, int no_of_books_published) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.no_of_books_published = no_of_books_published;
	}

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", author_name=" + author_name + ", no_of_books_published="
				+ no_of_books_published + "]";
	}
	
	
}
