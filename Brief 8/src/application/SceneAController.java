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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class SceneAController implements Initializable{
	
	    @FXML
	    private TextField admin;
	
	    @FXML
	    private Button login_btn;
	
	    @FXML
	    private PasswordField password;
	 
	    @FXML
	    private TextField email;

	    @FXML
	    private TextField nom;
	    
	    @FXML
	    private PasswordField password_user;

	    @FXML
	    private TextField prenom;

	    @FXML
	    private TextField username;

	    private Stage stage;
	     
	    Alert a = new Alert(AlertType.NONE);
     
	    public void login_btn(ActionEvent event) throws IOException {
		
	    	if(admin.getText().equals("MED") && password.getText().equals("12345")) {
			 Parent  root= FXMLLoader.load(getClass().getResource("SceneD.fxml"));
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
	
	public void singup_btn(ActionEvent  event) throws IOException {
			Parent  root= FXMLLoader.load(getClass().getResource("SingUP.fxml"));
	    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	  		
	}
	
	
	public void Singup(ActionEvent event) throws IOException {
		
		
		 
			try {
				
				 int password = Integer.parseInt(password_user.getText());
				 Users user = new Users(nom.getText(), prenom.getText(), password, email.getText(), username.getText());
				 TachEmp u = new  TachEmp();
		    	 u.AddUsers(user);
				
				 Parent  root= FXMLLoader.load(getClass().getResource("SceneD.fxml"));
		    	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	 Scene scene = new Scene(root);
				 stage.setScene(scene);
				 stage.show();
				   a.setAlertType(AlertType.CONFIRMATION);
	               a.show();
	               
			} catch (Exception e){
				
				
				a.setAlertType(AlertType.ERROR);
	  			a.show();
				
			}
			
           
		}
	
	
	public void BackBtn(ActionEvent event) throws IOException {
		 Parent  root= FXMLLoader.load(getClass().getResource("SceneA.fxml"));
    	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	 Scene scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
		
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
  
}
