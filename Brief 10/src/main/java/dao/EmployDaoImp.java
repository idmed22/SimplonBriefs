package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Employe;

public class EmployDaoImp  implements Dao{
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@Override
	public List<Employe> listEmploye() {

	        Session session = sessionFactory.openSession();		
	        session.beginTransaction();
	        Query query = (Query) session.createQuery("Select e from Employe e"); // pas correct
	        List<Employe> employe = query.list();
	        session.getTransaction().commit();
	        session.close();
		    return employe;
		
	}

	@Override
	public void addEmploye(Employe e) {                                     // work !!!!!
		
		    Session session = sessionFactory.openSession();		
		    session.beginTransaction();
		    session.save(e);
		    session.getTransaction().commit();
		    session.close();
	}

	@Override
	public void updateEmploye(Employe e) {                   // work !!!!
		
		    Session session = sessionFactory.openSession();	
	        session.beginTransaction();
	        session.update(e);
	        session.getTransaction().commit();
			session.close();
		
	}

	@Override
	public void deleteEmploye(long id) {                         // work !!!!
		
		    Session session = sessionFactory.openSession();	
            session.beginTransaction();
          //Employe user = (Employe) session.get(Employe.class, id);
            Object e =session.get(Employe.class, id);
            if(e==null) throw new RuntimeException("Employe not delete");
            session.delete(e);
            session.getTransaction().commit();
  		    session.close();
		
	}

	

	@Override
	public Employe getEmploye(long id) {
		
             Session session = sessionFactory.openSession();	
             session.beginTransaction();
     //      employe = (Employe) session.get(Employe.class, id);
             Object e =session.get(Employe.class, id);
             if(e==null) throw new RuntimeException("Employe introuvable");
             session.getTransaction().commit();
		     session.close();
		     return (Employe)e;
	}

	

}
