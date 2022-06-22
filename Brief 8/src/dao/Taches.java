package dao;

public class Taches {
	
	private String titre;
	private String description;
	private String status;
	private String deadline;
	private String  nom_categorie;
	
	public Taches(String titre, String description, String status, String deadline, String nom_categorie) {
		super();
		this.titre = titre;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.nom_categorie = nom_categorie;
	}

	public Taches(String titre) {
		super();
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getNom_categorie() {
		return nom_categorie;
	}

	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}

	@Override
	public String toString() {
		return "Taches [titre=" + titre + ", description=" + description + ", status=" + status + ", deadline="
				+ deadline + ", nom_categorie=" + nom_categorie + "]";
	}
	
	
	

}
