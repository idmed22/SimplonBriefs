package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import connection.Connect;
import model.Taches;

public class TacheImplement implements DaoTaches {

	@Override
	public List<Taches> listTaches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTaches(Taches t) {
		try {
			Connection connection = Connect.getConnection();
			String sql ="INSERT into Taches(titre,description,status,deadline,nom_categorie) values (?,?,?,?,?)";
			
			PreparedStatement stm = connection.prepareStatement(sql);
			
			connection.setAutoCommit(false);
		   
		    stm.setString(1, t.getTitre());
		    stm.setString(2, t.getDescription());
		    stm.setString(3, t.getStatus());
		    stm.setString(4, t.getDeadline());
		    stm.setString(5, t.getNom_categorie());
	    	stm.execute();
	    	connection.commit();
	    	stm.close();
		    connection.close();
					
					
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateTaches(Taches t) {
		try {
			Connection connection = Connect.getConnection();
			String sql ="UPDATE taches SET   description=?,status=? ,deadline=?, nom_categorie=? WHERE titre=?";
			
			PreparedStatement stm = connection.prepareStatement(sql);
			
			connection.setAutoCommit(false);
			
			
		    stm.setString(1, t.getDescription());
		    stm.setString(2, t.getStatus());
		    stm.setString(3, t.getDeadline());
		    stm.setString (4, t.getNom_categorie());
		    stm.setString(5, t.getTitre());
		    
	    	stm.execute();
	    	connection.commit();
	    	stm.close();
		    connection.close();
					
					
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void DeleteTaches(Taches titre) {
		try {
			Connection connection = Connect.getConnection();
			String sql ="DELETE FROM taches WHERE titre='" + titre.getTitre() + "'";
	    	
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.executeUpdate();
			//connection.commit(); 
			stm.close();
			connection.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Données pas Delete dans la table...");
		
		}
		
	}

}
