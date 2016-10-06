package media.model;

public class Music {


	private String title;
	private String album;
	private String category;
	
	public Music(String title, String album, String category) {
		
		super();
		this.title = title;
		this.album = album;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Music(){
		
		super();
	}
	
}
