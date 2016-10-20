package media.doa;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import media.model.Book;

public class BookDOA {
	
	public boolean setBook(Book b){
		
		
		//creates new session factory
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
	    configure().loadProperties("hibernate.cfg.xml").build();
	    SessionFactory sessionFactory = new Configuration().buildSessionFactory(serviceRegistry);
			        
	    // opens a new session from the session factory
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(b);
        session.getTransaction().commit();
        session.close();
        return true;
         

	}
   
	public ArrayList<Book> getBooks(){
    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
    	configure().loadProperties("hibernate.cfg.xml").build();
        SessionFactory sessionFactory = new Configuration().buildSessionFactory(serviceRegistry);
    						        
    		    // opens a new session from the session factory
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	
    	//return all movies from database
    	String hql = "FROM Book";
    	ArrayList<Book> books = new ArrayList<Book>();
    	
    	Query query = session.createQuery(hql);
    	
        books.addAll(query.list());
    	
    	return books;         
    }

}
