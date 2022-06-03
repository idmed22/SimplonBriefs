package brief;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class CandidatEmpl implements CandidatDao{


public List<Candidat>listCandidats() {
	
	return null;
}

public void addcandidats(Candidat  c) {
	
	
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
	System.out.println("Donn�es ins�r�s dans la table...");
//	return c;
	
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Donn�es pas ins�r�es dans la table...");
	//	return null;
	}
		
	
}
//-------------------------------------------------------------------------------------
public void updatecandidats(int id, Candidat c) {
	try {
		
		//Connection  connection = DriverManager.getConnection(jdbcURL, username, passward);
		Connection connection = Connect.getConnection();
		//
		String sql ="UPDATE candidat SET  id =?, nom=?, prenom=?,email=? ,adresse=?, ville=?, pays=? WHERE id ="+id;
		PreparedStatement stm = connection.prepareStatement(sql);
		System.out.println(id);
		
		//connection.setAutoCommit(false);
		stm.setInt(1, c.getId());
		stm.setString(2, c.getNom());
		stm.setString(3, c.getPrenom());
		stm.setString(4, c.getEmail());
		stm.setString(5, c.getAdresse());
		stm.setString(6, c.getVille());
		stm.setString(7, c.getPays());
		stm.executeUpdate();
		stm.setInt(1, id);
		//connection.commit();
		System.out.println("Donn�es UPdate dans la table ");
		stm.close();
		connection.close();
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Donn�es pas UPDATE dans la table...");
	
	}
}

//-----------------------------------------------------------------------------------------------
public void dropcandidats(int id){
try {
		
		//Connection  connection = DriverManager.getConnection(jdbcURL, username, passward);
		Connection connection = Connect.getConnection();
		
		//
		String sql ="DELETE FROM candidat WHERE id=" + id;
		PreparedStatement stm = connection.prepareStatement(sql);
		
	
		stm.executeUpdate();
		//connection.commit();
		System.out.println("Donn�es Delete dans la table ");
		stm.close();
		connection.close();
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Donn�es pas Delete dans la table...");
	
	}
	
	
}
	
	
	

//-------------------------------------------------------------------------------------------------


@Override
public void updatecandidats(Candidat c) {
	// TODO Auto-generated method stub
	
}

@Override
public void dropcandidats(Candidat c) {
	// TODO Auto-generated method stub
	
}
}
