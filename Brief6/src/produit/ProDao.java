package produit;

import java.util.List;

public interface ProDao {
	
	public List<Produit> listProduit ();
    public void add(Produit p);
    public void updateProduit(Produit  p);
    public void dropProduit(int id);
	
	

}
