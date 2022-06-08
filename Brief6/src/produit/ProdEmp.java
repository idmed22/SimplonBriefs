package produit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import Conn.Connect;

public class ProdEmp  implements ProDao {

	@Override
	public List<Produit> listProduit() {
		
		return null;
	}

	@Override
	public void add(Produit p) {
		
		try {
			
			Connection connection = Connect.getConnection();
			//
			String sql ="INSERT into produits (id_prodouit,nom_produit,prix_produit,date_produit,id_categorie) values (?,?,?,?,?)";
			//
			PreparedStatement stm = connection.prepareStatement(sql);
			
		connection.setAutoCommit(false);
		stm.setInt(1, p.getId_prodouit());
		stm.setString(2, p.getNom_produit());
		stm.setInt(3, p.getPrix_produit());
		stm.setString(4, p.getDate_produit());
		stm.setInt(5,p.getId_categorie());
		
		stm.execute();
		connection.commit();
		stm.close();
		connection.close();
		System.out.println("Insert Done");
         //		return p;
		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not Insert !!!!!");
		//	return null;
		}
		
	}
//------------------------------------------------Update Produit------------------------------------
	@Override
	public void updateProduit(Produit p) {
		
       try {
			
			Connection connection = Connect.getConnection();
			//
			String sql ="UPDATE produits SET  id_prodouit =?, nom_produit=?, "
					+ "prix_produit=?, date_produit=?,id_categorie=? WHERE id_prodouit ="+p.getId_prodouit();
			//
			PreparedStatement stm = connection.prepareStatement(sql);
			
		connection.setAutoCommit(false);
		stm.setInt(1, p.getId_prodouit());
		stm.setString(2, p.getNom_produit());
		stm.setInt(3, p.getPrix_produit());
		stm.setString(4, p.getDate_produit());
		stm.setInt(5,p.getId_categorie());
		
		stm.execute();
		connection.commit();
		stm.close();
		connection.close();
		System.out.println("UpDate Done");
//		return p;
		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not UpDate !!!!!");
		//	return null;
		}
		
	}
//-------------------------------------------------Drop Produit---------------------------------------------------


	@Override
	public void dropProduit(int id) {
		
        try {
			
			Connection connection = Connect.getConnection();
			
			//
			String sql ="DELETE FROM produits WHERE id_prodouit=" + id;
			PreparedStatement stm = connection.prepareStatement(sql);
		
			stm.execute();
			//connection.commit();
			System.out.println("Delete Done ");
			stm.close();
			connection.close();
			
	    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not Delete !!!!!");
		
		}
		
		
	}



}
