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
	
	public ArrayList<ArrayList<String>> listMovies(){
		
		MovieDOA d = new MovieDOA();
		
		ArrayList<Movie> mList = d.getMovies();
	    ArrayList<ArrayList<String>>movies = new ArrayList<ArrayList<String>>();
	    
        for(int i = 0; i < mList.size(); i++){
		    Movie m = mList.get(i);
		    ArrayList<String>fields = new ArrayList<String>();
		    fields.add(m.getTitle());
		    fields.add(m.getDirector());
		    fields.add(m.getViewDate());
		    fields.add(m.getCategory());
		    movies.add(fields);
		    //String[] fields = {m.getTitle(), m.getDirector(), m.getViewDate(), m.getCategory()};
		}   
		return movies;
	}

public void insertBook(String title, String author, String category, String completed){
		
		//Create Movie Object and set fields
		Book b = new Book();
	    BookDOA d = new BookDOA();
		
		b.setTitle(title);
		b.setAuthor(author);
		b.setCategory(category);
	    b.setCompleted(completed);
		
		d.setBook(b);
	
	}
	
	public ArrayList<ArrayList<String>> listBooks(){
		
		BookDOA d = new BookDOA();
		
		ArrayList<Book> bList = d.getBooks();
	    ArrayList<ArrayList<String>>books = new ArrayList<ArrayList<String>>();
	    
        for(int i = 0; i < bList.size(); i++){
		    Book b = bList.get(i);
		    ArrayList<String>fields = new ArrayList<String>();
		    fields.add(b.getTitle());
		    fields.add(b.getAuthor());
		    fields.add(b.getCategory());
		    fields.add(b.getCompleted());
		    books.add(fields);
		   
		}   
		return books;
	}
public void insertMusic(String title, String artist, String album, String category){
		
		//Create Music Model/Data Object and set fields
		Music m = new Music();
	    MusicDOA d = new MusicDOA();
		
		m.setTitle(title);
		m.setArtist(artist);
		m.setAlbum(album);
		m.setCategory(category);
	   
		
		d.setMusic(m);
	
	}
	
	public ArrayList<ArrayList<String>> listMusic(){
		
		MusicDOA d = new MusicDOA();
		
		ArrayList<Music> mList = d.getMusic();
	    ArrayList<ArrayList<String>>music = new ArrayList<ArrayList<String>>();
	    
        for(int i = 0; i < mList.size(); i++){
		    Music m = mList.get(i);
		    ArrayList<String>fields = new ArrayList<String>();
		    fields.add(m.getTitle());
		    fields.add(m.getArtist());
		    fields.add(m.getAlbum());
		    fields.add(m.getCategory());
		    music.add(fields);
		    
		}   
		return music;
	}
}
	




