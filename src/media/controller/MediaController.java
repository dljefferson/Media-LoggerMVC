package media.controller;
import java.util.ArrayList;

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
	
	public ArrayList<String[]> listMovies(){
		
		MovieDOA d = new MovieDOA();
		
	    ArrayList<Movie> mList = d.getMovies();
	    ArrayList<String[]>movies = new ArrayList<String[]>();
	  

	    //System.out.println(mList.size());
		for(int i = 0; i < mList.size(); i++){
		    Movie m = mList.get(i);
		    String[] fields = {m.getTitle(), m.getDirector(), m.getViewDate(), m.getCategory()};
		    movies.add(fields);
		    
		}   
		return movies;
	}

	
}
	




