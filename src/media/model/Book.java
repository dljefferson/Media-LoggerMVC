package media.model;

public class Book {

	private String title;
	private String author;
	private String category;
	private String completed;
	
	public Book(String title, String author, String category, String completed) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.completed = completed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}
	
	public Book(){
		super();
	}	
}
