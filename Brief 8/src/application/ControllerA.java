package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dao.TachEmp;
import dao.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerA  implements Initializable{
	
	
	    @FXML
	    private TextField nom;
	    
	    @FXML
	    private TextField prenom;
	    
	    @FXML
	    private TextField email;
	    
	    
	    @FXML
	    private PasswordField password_user;
	    
	    @FXML
	    private PasswordField password;

	    @FXML
	    private TextField username;
	    
	    Alert a = new Alert(AlertType.NONE);

	private Stage stage;
	
	public void ToSingUP(ActionEvent event) throws IOException {
		          Parent  root= FXMLLoader.load(getClass().getResource("SingUp.fxml"));
    	          stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	          Scene scene = new Scene(root);
		          stage.setScene(scene);
		          stage.show();
	}
	
	
	public void login(ActionEvent event) throws IOException {
		
		if(username.getText().equals("MED") && password.getText().equals("123")) {
			     Parent  root= FXMLLoader.load(getClass().getResource("Tasks.fxml"));
		    	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	 Scene scene = new Scene(root);
				 stage.setScene(scene);
				 stage.show();
	             a.setAlertType(AlertType.CONFIRMATION);
	             a.setContentText("Login successfully!");
	             a.show();
	  			
	  		}else {
	  			a.setAlertType(AlertType.ERROR);
	  			a.setContentText("You Cannot Login!");
		  			a.show();
		  		}
			
	}
	
	
	public void  Singup(ActionEvent event) {
		
		try {
			
			 int password = Integer.parseInt(password_user.getText());
			 Users user = new Users(nom.getText(), prenom.getText(), password, email.getText(), username.getText());
			 TachEmp u = new  TachEmp();
	    	 u.AddUsers(user);
			
			 Parent  root= FXMLLoader.load(getClass().getResource("Tasks.fxml"));
	    	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	 Scene scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();
			 a.setAlertType(AlertType.CONFIRMATION);
			 a.setContentText("Sing up successfully !!!");
             a.show();
              
		} catch (Exception e){
			a.setAlertType(AlertType.ERROR);
			a.setContentText("You Cannot Sing up !!!");
 			a.show();
			
		}
		
	}
	
	public void BackBtn(ActionEvent event) throws IOException {
		 Parent  root= FXMLLoader.load(getClass().getResource("login.fxml"));
    	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	 Scene scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
