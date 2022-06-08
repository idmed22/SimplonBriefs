package categ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import Conn.Connect;

public class CategEmp  implements CategDao{

	@Override
	public void listCategorie() {
		
		
	}

	@Override
	public void addCategorie(int id,String N) {
		
	
		 try {
				
				Connection connection = Connect.getConnection();
				//
				String sql ="INSERT into Categorie (id_categorie,nom_categorie) values ("+id+",'"+N+"')";
				//
				PreparedStatement stm = connection.prepareStatement(sql);
			
			    stm.execute();
			
			    //connection.commit();
			    //stm.close();
			    //connection.close();
			    //System.out.print("Insert Done");
	            //return c;
			    
		    }catch (Exception e) {
				e.printStackTrace();
				System.out.println("Not Delete !!!!!");
			
			
		 }
	}
		 
		 //-------------------------------------Update Categorie--------------------------------------
			
		 
	@Override
	public void updateCategorie(int id,String N) {
		
		

		 try {
				
				Connection connection = Connect.getConnection();
				//
				String sql ="UPDATE Categorie SET nom_categorie='"+N+"'  WHERE id_categorie="+id;
				System.out.println(id);
				//
				PreparedStatement stm = connection.prepareStatement(sql);
			
			    stm.execute();
			
			    //connection.commit();
		    	//stm.close();
			    //connection.close();
		    	//System.out.print("Insert Done");
	            //return c;
			    
		 }catch (Exception e) {
				e.printStackTrace();
				System.out.println("Not UpDate !!!!!");
			
			
		 }
		
	}
	
	
	 //-------------------------------------Delete Categorie--------------------------------------
	

	@Override
	public void dropCategorie(int id) {
		
        try {
			
			Connection connection = Connect.getConnection();
			
			//
			String sql ="DELETE FROM categorie WHERE id_categorie=" + id;
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