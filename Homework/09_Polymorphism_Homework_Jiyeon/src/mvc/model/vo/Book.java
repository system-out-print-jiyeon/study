package mvc.model.vo;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	
	public Book() {}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	
	
	public String toString() {
		return  title +" / " + author +" / "+ publisher;
	}
	
	
	
	
	
	
	
	
}
