package media.controller;
import media.model.*;
import media.entities.*;
public class MediaController {
	
	private Movie appMovie;
	private MovieModel appMovieMdl;
	
	
		
		//appMovie = new Movie();
	    //appBook = new Book();
	    //ppMusic = new Music();
		//this.appBook = new Book();
	    //this.appMusic = new Music();
	

	public void setMovie(String title, String director, String dateViewed, String category){
		
		appMovie = new Movie();
		
		appMovie.setTitle(title);
		appMovie.setDirector(director);
		appMovie.setDateViewed(dateViewed);
		appMovie.setCategory(category);
		
		appMovieMdl = new MovieModel();
		appMovieMdl.insertMovie(appMovie);
		//System.out.println(appMovie.getTitle());
	}
	

}
