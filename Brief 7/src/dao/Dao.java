package dao;

import java.util.List;

public interface Dao {
	public List<Candidat> listCandidats ();
    public void addcandidats(Candidat  c);
    public void updatecandidats(int id_cand,Candidat  c);
    public void dropcandidats( int id_cand );

}
