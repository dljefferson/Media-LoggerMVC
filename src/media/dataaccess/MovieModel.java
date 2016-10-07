package media.dataaccess;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import media.model.*;
public class MovieModel {

	public boolean insertMovie(Movie m){
		
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

	//public Movie[] getMovie(){
		
		//return null;
		
	//}
}
