package produit;

public class Produit {
	
	private int id_prodouit;
	private String nom_produit;
	private int prix_produit;
	private String date_produit;
	private int id_categorie;
	public Produit(int id_prodouit, String nom_produit, int prix_produit, String date_produit, int id_categorie) {
		super();
		this.id_prodouit = id_prodouit;
		this.nom_produit = nom_produit;
		this.prix_produit = prix_produit;
		this.date_produit = date_produit;
		this.id_categorie = id_categorie;
	}
	public int getId_prodouit() {
		return id_prodouit;
	}
	public void setId_prodouit(int id_prodouit) {
		this.id_prodouit = id_prodouit;
	}
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public int getPrix_produit() {
		return prix_produit;
	}
	public void setPrix_produit(int prix_produit) {
		this.prix_produit = prix_produit;
	}
	public String getDate_produit() {
		return date_produit;
	}
	public void setDate_produit(String date_produit) {
		this.date_produit = date_produit;
	}
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	@Override
	public String toString() {
		return "Produit [id_prodouit=" + id_prodouit + ", nom_produit=" + nom_produit + ", prix_produit=" + prix_produit
				+ ", date_produit=" + date_produit + ", id_categorie=" + id_categorie + "]";
	}
	
	
	
}
