package model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
    System.out.println("Project started ...");
 
    Configuration cfg = new  Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    System.out.println(factory);
  
    
  
	}

}
