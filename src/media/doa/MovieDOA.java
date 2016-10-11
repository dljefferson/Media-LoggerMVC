package media.doa;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import media.model.*;

public class MovieDOA {
	
    //inserts movie into database
	public boolean setMovie(Movie m){
		
	
		//creates new session factory
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
	    configure().loadProperties("hibernate.cfg.xml").build();
	    SessionFactory sessionFactory = new Configuration().buildSessionFactory(serviceRegistry);
			        
	    // opens a new session from the session factory
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(m);
        session.getTransaction().commit();
        session.close();
        return true;
         
	
	}
    //Movie[]
	public Movie getMovie(){
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
	    configure().loadProperties("hibernate.cfg.xml").build();
		SessionFactory sessionFactory = new Configuration().buildSessionFactory(serviceRegistry);
					        
	    // opens a new session from the session factory
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		        
	    Movie m = (Movie)session.get(Movie.class, new Integer(6));
		        
		session.getTransaction().commit();
		session.close();
	    return m;
	          	
	}

    

}
