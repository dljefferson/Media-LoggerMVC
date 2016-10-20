package media.model;

public class Book {
    
	private int id;
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

	public Book(int id, String title, String author, String category, String completed){
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.completed = completed;
	}
	
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
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
