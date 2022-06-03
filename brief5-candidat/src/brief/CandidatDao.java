package brief;

import java.util.List;

public interface CandidatDao {
	public List<Candidat> listCandidats ();
    public void addcandidats(Candidat  c);
    public void updatecandidats(Candidat  c);
    public void dropcandidats(Candidat  c);
}
