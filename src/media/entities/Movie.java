package media.entities;

public class Movie {
	private String title;
	private String director;
	private String dateViewed;
	private String category;
	
	public Movie(String title, String director, String dateViewed, String category){
		super();
		this.title = title;
		this.director = director;
		this.dateViewed = dateViewed;
		this.category = category;
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

	public String getDateViewed() {
		return dateViewed;
	}

	public void setDateViewed(String dateViewed) {
		this.dateViewed = dateViewed;
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
