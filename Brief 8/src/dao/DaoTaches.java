package dao;

import java.util.List;

public interface DaoTaches {

	public List<Taches> listTaches ();
    public void addTaches(Taches  t);
    public void updateTaches(Taches  titre);
    public void DeleteTaches(Taches titre);
    public void AddUsers(Users u);
	void DeleteTaches();
    
}
