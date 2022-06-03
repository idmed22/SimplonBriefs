package brief;

public class Candidat {
  private int id;
  private String nom;
  private String prenom;
  private String email;
  private String  adresse;
  private String ville;
  private String pays;
  
  


public Candidat(int id, String nom, String prenom, String email, String adresse, String ville, String pays) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.adresse = adresse;
	this.ville = ville;
	this.pays = pays;
}

public int getId() {
	return id;
}

public void setId(int id) {
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getPays() {
	return pays;
}

public void setPays(String pays) {
	this.pays = pays;
}


public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + id;
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((pays == null) ? 0 : pays.hashCode());
	result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
	result = prime * result + ((ville == null) ? 0 : ville.hashCode());
	return result;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Candidat other = (Candidat) obj;
	if (adresse == null) {
		if (other.adresse != null)
			return false;
	} else if (!adresse.equals(other.adresse))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (id != other.id)
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (pays == null) {
		if (other.pays != null)
			return false;
	} else if (!pays.equals(other.pays))
		return false;
	if (prenom == null) {
		if (other.prenom != null)
			return false;
	} else if (!prenom.equals(other.prenom))
		return false;
	if (ville == null) {
		if (other.ville != null)
			return false;
	} else if (!ville.equals(other.ville))
		return false;
	return true;
}
  

@Override
public String toString() {
	return "Candidats [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse
			+ ", ville=" + ville + ", pays=" + pays + "]";
}
	
	
}
