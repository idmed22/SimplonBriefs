package dao;

import java.util.List;

import model.Taches;

public interface DaoTaches {
	
	public List<Taches> listTaches ();
    public void addTaches(Taches  t);
    public void updateTaches(Taches  t);
    public void DeleteTaches(Taches titre);

}
