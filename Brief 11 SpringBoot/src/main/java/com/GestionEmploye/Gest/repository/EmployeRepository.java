package com.GestionEmploye.Gest.repository;

import com.GestionEmploye.Gest.model.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
