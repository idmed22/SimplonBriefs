package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.Connect;
import model.Users;

public class UserImplement  implements DaoUsers{

	@Override
	public void AddUsers(Users u) {
		
		try {
			
			Connection connection = Connect.getConnection();
			String sql ="INSERT into users(nom,prenom,email,username,password) values (?,?,?,?,?)";
			
			PreparedStatement stm = connection.prepareStatement(sql);
			
			connection.setAutoCommit(false);
		    stm.setString(1, u.getNom());
		    stm.setString(2, u.getPrenom());
		    stm.setString(3, u.getEmail());
		    stm.setString(4, u.getUsername());
		    stm.setString(5, u.getPassword());
	    	stm.execute();
	    	connection.commit();
	    	stm.close();
		    connection.close();
					
					
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
