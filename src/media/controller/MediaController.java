package media.controller;
import media.doa.*;
import media.model.*;

public class MediaController {
	
	
	
	public void insertMovie(String title, String director, String dateViewed, String category){
		
		//Create Movie Object and set fields
		Movie m = new Movie();
	    MovieDOA d = new MovieDOA();
		
		m.setTitle(title);
		m.setDirector(director);
		m.setViewDate(dateViewed);
	    m.setCategory(category);
		
		d.setMovie(m);
	
	}
	

	public void viewMovie(){
		
		MovieDOA d = new MovieDOA();
		Movie m = new Movie(); 
	    
		m = d.getMovie();
		System.out.println(m.getTitle() + m.getCategory() + m.getDirector() + m.getViewDate());
		
	}
}
