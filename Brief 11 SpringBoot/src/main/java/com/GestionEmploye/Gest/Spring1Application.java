package com.GestionEmploye.Gest;

import com.GestionEmploye.Gest.model.Employe;
import com.GestionEmploye.Gest.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application implements CommandLineRunner {
     
   @Autowired
    private EmployeRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
		System.out.println("Project Start !!!!!!!");
	}

	@Override
	public void run(String... args) throws Exception {
		/*-------------insert employes Done---------------------------------------------------
		repository.save(new Employe(1,"Hebernate", " dima Error", 5000, "Professeur", "CDI"));
    	repository.save(new Employe(2,"KHALIL", "one", 7000, "Professeur", "CDI"));
		repository.save(new Employe(3,"NAWAN", "two", 9000, "Professeur", "CDI"));
    	repository.save(new Employe(4,"ANASS", "tree", 8000, "Professeur", "CDI"));
		*/
		
		/*---------------select all employes Done---------------------------------------------
		repository.findAll().forEach(employe->{
			System.out.println(employe.toString());
		});
		*/
		/*--------------------select employe by id Done --------------------------------------
		System.out.println("----------------------");
		
		Employe employe = repository.findById(1L).get();
		System.out.println(employe.getPrenom());
		*/
		//------------------delete employe Done-------------------------------------------------
		
		System.out.println("-----------------------");
		
		//repository.deleteById(4L);;
		
		//----------------insert Admin--------------------------------------------------------
		
		
		
	}

}
