package media.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import media.controller.*;
public class MediaLoggerView {

	private JFrame frmMediaLogger;

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
		
		
		JButton btnLogMovie = new JButton("Log Movie");
		btnLogMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String title = setText("Enter Movie Title",  "Title Dialog");
			    String director = setText("Enter Director", "Director Dialog");	
			    String dateViewed = setText("Enter Date Viewed", "Dated Viewed Dialog");
				String category = setText("Enter Category", "Category Dialog");
				MediaController appMe = new MediaController();
				appMe.setMovie(title, director, dateViewed, category);
				
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
		
		JButton btnMoviesSeen = new JButton("Movies Seen");
		btnMoviesSeen.setBounds(94, 132, 250, 23);
		panel.add(btnMoviesSeen);
		
		JButton btnBooksRead = new JButton("Books Read");
		btnBooksRead.setBounds(94, 166, 250, 23);
		panel.add(btnBooksRead);
		
		JButton btnMusicListenedTo = new JButton("Music Listened To");
		btnMusicListenedTo.setBounds(94, 200, 250, 23);
		panel.add(btnMusicListenedTo);
	}

    public String setText(String prompt, String title) {
		
    	
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