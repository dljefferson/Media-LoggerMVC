package media.model;

public class Music {

    private int id;
	private String title;
	private String artist;
	private String album;
	private String category;
	
	public Music(int id, String title, String artist, String album, String category){
		
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.category = category;
		
	}
	
	public Music(String title, String artist, String album, String category) {
		
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
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

	public String getArtist(){
		return artist;
	}

	public void setArtist(String artist){
		this.artist = artist;
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
