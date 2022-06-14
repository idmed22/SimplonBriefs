package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import conn.Connect;

public class DaoEmp implements Dao{
	
	public int id;
	
	@Override
	public List<Candidat> listCandidats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addcandidats(Candidat c) {
		try {
			
			Connection connection = Connect.getConnection();
			//
			String sql ="INSERT into candidat(id,nom,prenom,email,adresse,ville,pays) values (?,?,?,?,?,?,?)";
			//
			PreparedStatement stm = connection.prepareStatement(sql);
			
		    connection.setAutoCommit(false);
		    stm.setInt(1, c.getId());
		    stm.setString(2, c.getNom());
		    stm.setString(3, c.getPrenom());
		    stm.setString(4, c.getEmail());
		    stm.setString(5, c.getAdresse());
	    	stm.setString(6, c.getVille());
	    	stm.setString(7, c.getPays());
	    	stm.execute();
	    	connection.commit();
	    	stm.close();
		    connection.close();
		    System.out.println("Données insérés dans la table...");
        //		return c;
		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Données pas insérées dans la table...");
		//	return null;
		}
			
		
	}

	@Override
	public void updatecandidats(int id_cand,Candidat c) {
		try {
			
			//Connection  connection = DriverManager.getConnection(jdbcURL, username, passward);
			Connection connection = Connect.getConnection();
			//
			String sql ="UPDATE candidat SET  nom=?, prenom=?,email=? ,adresse=?, ville=?, pays=? WHERE id=?";
			PreparedStatement stm = connection.prepareStatement(sql);
			
			//connection.setAutoCommit(false);
			stm.setString(1, c.getNom());
			stm.setString(2, c.getPrenom());
			stm.setString(3, c.getEmail());
			stm.setString(4, c.getAdresse());
			stm.setString(5, c.getVille());
			stm.setString(6, c.getPays());
			stm.setInt(7, c.getId());

			stm.executeUpdate();
			//stm.setInt(1, id);
			//connection.commit();
			System.out.println("Données UPdate dans la table ");
			stm.close();
			connection.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Données pas UPDATE dans la table...");
		
		}
		
	}

	@Override
	public void dropcandidats( int id_cand) { 
		try {
			
			
			Connection connection = Connect.getConnection();
			String sql ="DELETE FROM candidat WHERE id= "+id_cand;
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.executeUpdate();
			System.out.println(stm.executeUpdate());
			//connection.commit();
			System.out.println("Données Delete dans la table ");
			stm.close();
			connection.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Données pas Delete dans la table..."+e);
		
		}
		
	}

	

}
