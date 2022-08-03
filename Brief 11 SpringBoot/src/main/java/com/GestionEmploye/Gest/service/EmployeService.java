package com.GestionEmploye.Gest.service;

import java.util.List;

import com.GestionEmploye.Gest.model.Employe;

public interface EmployeService {
	
	    List < Employe > getAllEmployes();
	    void saveEmploye(Employe employe);
	    Employe getEmployeById(long id);
	    void deleteEmployeById(long id);
	  //void updateEmploye(Employe employe);

}
