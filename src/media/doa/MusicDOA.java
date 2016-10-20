package media.doa;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import media.model.Music;

public class MusicDOA {
	
public boolean setMusic(Music m){
		
		
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
   
public ArrayList<Music> getMusic(){
    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
    	configure().loadProperties("hibernate.cfg.xml").build();
        SessionFactory sessionFactory = new Configuration().buildSessionFactory(serviceRegistry);
    						        
    		    // opens a new session from the session factory
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	
    	//return all movies from database
    	String hql = "FROM Music";
    	ArrayList<Music> songs = new ArrayList<Music>();
    	
    	Query query = session.createQuery(hql);
    	
        songs.addAll(query.list());
    	
    	return songs;         
    }

}
