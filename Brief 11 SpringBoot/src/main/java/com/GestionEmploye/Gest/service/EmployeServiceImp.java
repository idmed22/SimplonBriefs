package com.GestionEmploye.Gest.service;

import java.util.List;
import java.util.Optional;

import com.GestionEmploye.Gest.model.Employe;
import com.GestionEmploye.Gest.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImp implements EmployeService{
	
	@Autowired
    private EmployeRepository employeRepository;

	@Override
	public List<Employe> getAllEmployes() {
	  return employeRepository.findAll();
	}

	@Override
	public void saveEmploye(Employe employe) {
		this.employeRepository.save(employe);
		
	}

	@Override
	public Employe getEmployeById(long id) {
		Optional < Employe > optional = employeRepository.findById(id);
        Employe employe = null;
        if (optional.isPresent()) {
            employe = optional.get();
        } else {
            throw new RuntimeException(" Employe not found for id :: " + id);
        }
        return employe;
	}

	@Override
	public void deleteEmployeById(long id) {
		this.employeRepository.deleteById(id);
		
	}

	

	
}
