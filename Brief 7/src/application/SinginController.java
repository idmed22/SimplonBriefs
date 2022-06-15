package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SinginController implements Initializable {
	     
	    private Stage stage;
	
	    @FXML
	    private TextField admin;

	    @FXML
	    private Button login_btn;

	    @FXML
	    private PasswordField password;
	    
	    //Alert
	      
	    Alert a = new Alert(AlertType.NONE);
	     
	     
	    
	    public void switchTo(ActionEvent event) throws IOException {
	    	
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//Stage stage = new Stage();
			//Stage stage = (Stage) root.getScene().getWindow();
			if(admin.getText().equals("Med") && password.getText().equals("123")) {
				Parent  root= FXMLLoader.load(getClass().getResource("Scene.fxml"));
		    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
	              a.setAlertType(AlertType.CONFIRMATION);
	              a.show();
		  			
		  		}else {
		  			a.setAlertType(AlertType.ERROR);
		  			a.show();
		  		}
	
	    }
	      
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	

	
	

