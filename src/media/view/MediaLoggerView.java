package media.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.mapping.List;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import media.controller.*;


public class MediaLoggerView {
 
	private JFrame frmMediaLogger;
	private JButton btnMoviesSeen;
    private JTable mediaTable;
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
				String title = setText("Enter Movie Title",  "Title Dialog");;
			    do{
			    	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Title",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			        title = setText("Enter Movie Title",  "Title Dialog");    
			    }while(title.equals(""));
				
			    //Get movie director
			    String director = setText("Enter Director", "Director Dialog");	
                do{
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Director",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	director = setText("Enter Director", "Director Dialog");
			    }while(director.equals(""));
				
                //Get date viewed
                String dateViewed = setText("Enter Date Viewed", "Dated Viewed Dialog");
                do{
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Date Viewed",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	dateViewed = setText("Enter Date Viewed", "Dated Viewed Dialog");   
			    }while(dateViewed.equals(""));
                
                //Get movie category
                String category = setText("Enter Category", "Category Dialog");
                do{
                	JOptionPane.showMessageDialog(frmMediaLogger,
						    "You Must Enter Category",
						    "Media Logger",
						    JOptionPane.PLAIN_MESSAGE);
			    	category = setText("Enter Category", "Category Dialog"); 
			    }while(category.equals(""));
				
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
		
		JButton btnLogBook = new JButton("Log Book");
		btnLogBook.setBounds(94, 64, 250, 23);
		panel.add(btnLogBook);
		
		JButton btnLogMusic = new JButton("Log Music");
		btnLogMusic.setBounds(94, 98, 249, 23);
		panel.add(btnLogMusic);
		
		btnMoviesSeen = new JButton("Movies Seen");
		btnMoviesSeen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<ArrayList<String>>list = appController.listMovies();
				Object[] movieCols = {"Title", "Director", "Date Viewed", "Category"};
				String[][] tempTable = new String[list.size()][];
				
				int i = 0;
			    for (ArrayList<String> next : list) {
			      tempTable[i++] = next.toArray(new String[next.size()]);
			        }

			        JTable EndTable = new JTable(tempTable,movieCols);

			        JFrame frame = new JFrame("Movies Seen");
			        frame.getContentPane().add(new JScrollPane(EndTable));
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.pack();
			        frame.setVisible(true);
				
			}
		});
		btnMoviesSeen.setBounds(94, 132, 250, 23);
		panel.add(btnMoviesSeen);
		
		JButton btnBooksRead = new JButton("Books Read");
		btnBooksRead.setBounds(94, 166, 250, 23);
		panel.add(btnBooksRead);
		
		JButton btnMusicListenedTo = new JButton("Music Listened To");
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