package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	
 public static  Connection getConnection() throws ClassNotFoundException {
		 
		 String driver="org.postgresql.Driver";
		 String jdbcURL = "jdbc:postgresql://localhost:5432/TodoList";
		 String username="postgres";
		 String passward ="000000";
		
		   try {
			   
			   Class.forName(driver);
			   Connection  connection = DriverManager.getConnection(jdbcURL, username, passward);
		       System.out.println("It's Connecting .....");
		       return connection;
		       
		   }catch (SQLException e) {
				System.out.println("ERROR IN CONNECTING TO PostgreSQL server");
				e.printStackTrace();
			}
		   
		   return null; 
		 
	        }
	

}
