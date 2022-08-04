package com.GestionEmploye.Gest.controller;

import com.GestionEmploye.Gest.model.Employe;
import com.GestionEmploye.Gest.service.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeController {
	
	@Autowired
    private EmployeService employeService;
	
	 @GetMapping("/")
	 public String viewHomePage(Model model) {
        model.addAttribute("listEmployes", employeService.getAllEmployes());
        return "index";
    }
	 
	 @GetMapping("/showNewEmployeForm")
	 public String showNewEmployeeForm(Model model) {
	        // create model attribute to bind form data
	        Employe employe = new Employe();
	        model.addAttribute("employe", employe);
	        return "AddEmploye";
	    }
	 
	 @PostMapping("/saveEmploye")
	    public String saveEmploye(@ModelAttribute("employe") Employe employe) {
	        // save employee to database
	        employeService.saveEmploye(employe);
	        return "redirect:/";
	    }
	 
	 
	 @GetMapping("/showFormForUpdate/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

	        Employe employe = employeService.getEmployeById(id);
	        
	        model.addAttribute("employe", employe);
	        return "updateEmploye";
	    }
	 
	 @GetMapping("/deleteEmploye/{id}")
	    public String deleteEmploye(@PathVariable(value = "id") long id) {

	        // call delete employee method 
	        this.employeService.deleteEmployeById(id);
	        return "redirect:/";
	    }


}
