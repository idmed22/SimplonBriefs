package model;

import org.hibernate.Session;

import dao.AdminDaoImp;
import dao.EmployDaoImp;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
      System.out.println("Project started ...");
      
      Session session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      
      
       EmployDaoImp em = new EmployDaoImp();
       AdminDaoImp ad = new AdminDaoImp();
      
      // -----------------------------Add employe work---------------------------------------
      /*
       em.addEmploye(new Employe("MED", "Error", 5000, "Professeur", "CDI"));
       em.addEmploye(new Employe("KHALIL", "one", 7000, "Professeur", "CDI"));
       em.addEmploye(new Employe("NAWAN", "two", 9000, "Professeur", "CDI"));
       em.addEmploye(new Employe("ANASS", "tree", 8000, "Professeur", "CDI"));
        */
     // ------------------------------update employe  work ----------------------------------
       
        /*
       Employe e = em.getEmploye(3L);
       e.setPrenom("SQL");
       em.updateEmploye(e);
       */
       
      // ------------------------------delete employe work------------------------------------
       
      // em.deleteEmploye(3L); 
      //---------------------------------Add Admin  work --------------------------------------------
       
     //  ad.addAdmin(new Admin("MED",123));
      
      //--------------------------------Admin update------------------------------------------
       
       
       
       
       
      
      HibernateUtil.getSessionFactory().close();
   
	}
}
