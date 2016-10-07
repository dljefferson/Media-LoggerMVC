package media.model;

public class Movie {
	private int id;
	private String title;
	private String director;
	private String viewDate;
	private String category;
	
	public Movie(int id, String title, String director, String viewDate, String category){
		super();
		this.title = title;
		this.director = director;
		this.viewDate = viewDate;
		this.category = category;
	}
	
	public Movie(String title, String director, String viewDate, String category){
		super();
		this.title = title;
		this.director = director;
		this.viewDate = viewDate;
		this.category = category;
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getViewDate() {
		return viewDate;
	}

	public void setViewDate(String viewDate) {
		this.viewDate = viewDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Movie(){
		super();
	}
	
	
}
