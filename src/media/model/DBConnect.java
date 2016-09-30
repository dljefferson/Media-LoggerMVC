package media.model;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
	
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/media_db?autoReconnect=true&useSSL=false", "root", "dljz8x");
		}catch (Exception e){
			con = null;
			
		}
	    return con;
	}

}
