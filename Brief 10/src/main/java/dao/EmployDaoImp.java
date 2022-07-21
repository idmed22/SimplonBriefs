package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Employe;

public class EmployDaoImp  implements Dao{
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@Override
	public List<Employe> listEmploye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmploye(Employe e) {
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		
		
		
	}

	@Override
	public void updateEmploye(Employe e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmploye(int id) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public Employe getEmploye(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
