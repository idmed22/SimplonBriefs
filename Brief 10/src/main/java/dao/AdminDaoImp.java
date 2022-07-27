package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Admin;

public class AdminDaoImp implements AdminDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	@Override
	public void addAdmin(Admin a) {
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void updateAdmin(Admin a) {
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public boolean validate(String username, int password) {
		

		
		/*
		Admin admin = null;
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		admin = (Admin) session.createQuery("FROM Admin a WHERE a.username = :username").setParameter("username", username)
				.uniqueResult();
		if(admin != null && admin.getUsername().equals(username)) {
			return true;
		}
		
		session.getTransaction().commit();
		session.close();
		
		*/
		return false;
	}
	
	


}
