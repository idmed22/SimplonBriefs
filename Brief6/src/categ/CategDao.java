package categ;



public interface CategDao {

	public void listCategorie ();
    public void addCategorie(int id,String N);
    public void updateCategorie(int id,String N);
    public void dropCategorie(int id);
}
