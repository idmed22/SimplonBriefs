package dao;

public class Users {
	
	private String nom;
	private String prenom;
	private int password;
	private String email;
	private String username;
	
	
	public Users(String nom, String prenom, int password, String email, String username) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email = email;
		this.username = username;
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


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Users [nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", email=" + email
				+ ", username=" + username + "]";
	}
	

}
