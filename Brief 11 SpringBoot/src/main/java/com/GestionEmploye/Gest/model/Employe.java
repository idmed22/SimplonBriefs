package com.GestionEmploye.Gest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employe {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private double salaire;
	private String post;
	private String typeCont;
	
	
	
	public Employe(long id, String nom, String prenom, double salaire, String post, String typeCont) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.post = post;
		this.typeCont = typeCont;
	}
	
	
	public Employe(String nom, String prenom, double salaire, String post, String typeCont) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.post = post;
		this.typeCont = typeCont;
	}


	public Employe() {
		super();
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getTypeCont() {
		return typeCont;
	}
	public void setTypeCont(String typeCont) {
		this.typeCont = typeCont;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ", post=" + post
				+ ", typeCont=" + typeCont + "]";
	}
	
	
}
