package media.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//import org.hibernate.mapping.List;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import java.util.Arrays;
import java.awt.event.ActionEvent;
import media.controller.*;


public class MediaLoggerView {
 
	private JFrame frmMediaLogger;
	private JButton btnMoviesSeen;
    //private JTable mediaTable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaLoggerView window = new MediaLoggerView();
					window.frmMediaLogger.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MediaLoggerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMediaLogger = new JFrame();
		frmMediaLogger.setTitle("Media Logger");
		frmMediaLogger.setBounds(100, 100, 450, 300);
		frmMediaLogger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JPanel panel = new JPanel();
		frmMediaLogger.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//Create new Media Controller object
	    MediaController appController = new MediaController();
		
		//Create movie button
	    JButton btnLogMovie = new JButton("Log Movie");
		
	    btnLogMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                
				//Get movie title
				String title = "";
				title = setText("Enter Movie Title",  "Title Dialog");
				while(title.equals("")){
					
					JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Title",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			        title = setText("Enter Movie Title",  "Title Dialog");    
			    }
				
			    //Get movie director
			    String director = "";	
			    director = setText("Enter Director", "Director Dialog");
			    while(director.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Director",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	director = setText("Enter Director", "Director Dialog");
			    }
				
                //Get date viewed
                String dateViewed = "";
                dateViewed = setText("Enter Date Viewed", "Dated Viewed Dialog");
                while(dateViewed.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Date Viewed",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	dateViewed = setText("Enter Date Viewed", "Dated Viewed Dialog");   
			    }
                
                //Get movie category
                String category = "";
                category = setText("Enter Category", "Category Dialog");
                while(category.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Category",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	category = setText("Enter Category", "Category Dialog"); 
			    }
				
                //Pass movie info to controller
				appController.insertMovie(title, director, dateViewed, category);
				
				//Confirm Movie has been logged
				JOptionPane.showMessageDialog(frmMediaLogger,
					    "Movie Logged",
					    "Media Logger",
					    JOptionPane.PLAIN_MESSAGE);
				}
		});
		
	    btnLogMovie.setBounds(94, 30, 250, 23);
		panel.add(btnLogMovie);
		
		
		//Create Book Button
		JButton btnLogBook = new JButton("Log Book");
		btnLogBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String title = "";
				title = setText("Enter Book Title",  "Title Dialog");
				while(title.equals("")){
			    	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Title",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			        title = setText("Enter Book Title",  "Title Dialog");    
			    }
				
			  
			    String author = "";
			    author = setText("Enter Author", "Author Dialog");	
			    while(author.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Author",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	author = setText("Enter Author", "Author Dialog");
			    }
				
             
                String category = "";
                category = setText("Enter Category", "Category Dialog");
                while(category.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Category",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	category = setText("Enter Category", "Category Dialog"); 
			    }
                
                
                String completed = "";
                completed = setText("Completed? (Yes/No)", "Book Status");
                while(completed.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Book Status",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	completed = setText("Completed? (Yes/No)", "Book Status");   
			    }
                
                //Pass Book info to controller
				appController.insertBook(title, author, category, completed);
				
				//Confirm Book has been logged
				JOptionPane.showMessageDialog(frmMediaLogger,
					    "Book Logged",
					    "Media Logger",
					    JOptionPane.PLAIN_MESSAGE);
				}
				
			
		});
		btnLogBook.setBounds(94, 64, 250, 23);
		panel.add(btnLogBook);
		
		JButton btnLogMusic = new JButton("Log Music");
		btnLogMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String title = "";
				title = setText("Enter Music Title",  "Title Dialog");
				while(title.equals("")){
			    	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Title",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			        title = setText("Enter Music Title",  "Title Dialog");    
			    }
				
			    
			    String artist = "";
			    artist = setText("Enter Artist", "Artist Dialog");	
			    while(artist.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Artist",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	artist = setText("Enter Artist", "Artist Dialog");
			    }
				
            
			    String album = "";
                album = setText("Enter Album", "Album Dialog");
           
                
                String category = "";
                category = setText("Enter Category", "Category Dialog");
                while(category.equals("")){
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Category",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	category = setText("Enter Category", "Category Dialog");   
			    }
                
                //Pass Music info to controller
				appController.insertMusic(title, artist, album, category);
				
				//Confirm Music has been logged
				JOptionPane.showMessageDialog(frmMediaLogger,
					    "Music Logged",
					    "Media Logger",
					    JOptionPane.PLAIN_MESSAGE);
				}
				
			
		});
		btnLogMusic.setBounds(94, 98, 249, 23);
		panel.add(btnLogMusic);
		
		btnMoviesSeen = new JButton("Movies Seen");
		btnMoviesSeen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<ArrayList<String>>list = appController.listMovies();
				Object[] movieCols = {"Title", "Director", "Date Viewed", "Category"};
				String[][] movieTable = new String[list.size()][];
				
				int i = 0;
			    for (ArrayList<String> next : list) {
			      movieTable[i++] = next.toArray(new String[next.size()]);
			        }

			        JTable EndTable = new JTable(movieTable,movieCols);

			        JFrame frame = new JFrame("Movies Seen");
			        frame.getContentPane().add(new JScrollPane(EndTable));
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.pack();
			        frame.setVisible(true);
				
			}
		});
		btnMoviesSeen.setBounds(94, 132, 250, 23);
		panel.add(btnMoviesSeen);
		
		JButton btnBooksRead = new JButton("Books Read/Reading");
		btnBooksRead.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ArrayList<ArrayList<String>>list = appController.listBooks();
				Object[] bookCols = {"Title", "Author", "Category", "Completed"};
				String[][] bookTable = new String[list.size()][];
				
				int i = 0;
			    for (ArrayList<String> next : list) {
			      bookTable[i++] = next.toArray(new String[next.size()]);
			        }

			        JTable EndTable = new JTable(bookTable, bookCols);

			        JFrame frame = new JFrame("Books Read/Reading");
			        frame.getContentPane().add(new JScrollPane(EndTable));
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.pack();
			        frame.setVisible(true);
				
			}
				
			
		});
		btnBooksRead.setBounds(94, 166, 250, 23);
		panel.add(btnBooksRead);
		
		JButton btnMusicListenedTo = new JButton("Music Listened To");
		btnMusicListenedTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			        ArrayList<ArrayList<String>>list = appController.listMusic();
					Object[] musicCols = {"Title", "Artist", "Album", "Category"};
					String[][] musicTable = new String[list.size()][];
					
					int i = 0;
				    for (ArrayList<String> next : list) {
				      musicTable[i++] = next.toArray(new String[next.size()]);
				        }

				        JTable EndTable = new JTable(musicTable, musicCols);

				        JFrame frame = new JFrame("Music Listened to");
				        frame.getContentPane().add(new JScrollPane(EndTable));
				        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        frame.pack();
				        frame.setVisible(true);
					
				}
			
		});
		btnMusicListenedTo.setBounds(94, 200, 250, 23);
		panel.add(btnMusicListenedTo);
		
		
	}

    
	//Method for prompting user for text
	private String setText(String prompt, String title) {
		
    	String s = (String)JOptionPane.showInputDialog(
		frmMediaLogger,
		prompt,
		title, JOptionPane.PLAIN_MESSAGE,
		null,
		null,
		"");
        
    	return s;
    }
    
	

}