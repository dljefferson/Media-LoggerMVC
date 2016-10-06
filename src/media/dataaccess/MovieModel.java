package media.dataaccess;
import java.sql.*;


import media.model.*;
public class MovieModel {

	public boolean insertMovie(Movie m){
		
		PreparedStatement ps = null;
		try{
			ps = DBConnect.getConnection().prepareStatement(
					"INSERT INTO MOVIES(title,director,viewDate,category) VALUES(?,?,?,?)");
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getDirector());
			ps.setString(3, m.getDateViewed());
		    ps.setString(4, m.getCategory());
		    //System.out.println(m.getTitle() + m.getDirector() + m.getDateViewed());
		    return ps.executeUpdate() > 0;
		    
		}catch(Exception e){
			return false;
		}
		
	}

	public Movie[] getMovie(){
		
		return null;
		
	}
}
