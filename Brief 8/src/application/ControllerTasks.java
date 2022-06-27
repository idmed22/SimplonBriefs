package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import conn.Connect;
import dao.TachEmp;
import dao.Taches;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ControllerTasks implements Initializable {
	
	Stage stage;
	
	@FXML
    private TableColumn<Taches, String> nom_categorie;

    @FXML
    private TableColumn<Taches, String> deadline;

    @FXML
    private TableColumn<Taches, String> description;

    @FXML
    private TableColumn<Taches, String> status;

    @FXML
    private TableView<Taches> table;

    @FXML
    private TableColumn<Taches, String> titre;

	
	ObservableList<Taches> listTaches = FXCollections.observableArrayList();
	
	 public ObservableList<Taches> listTaches() throws ClassNotFoundException{
			
     	
	    	Connection connection = Connect.getConnection();
	    	String query = "SELECT * FROM taches ";
	    	Statement st;
	    	ResultSet rs;
	    	
	    	try {
	    		
				st = connection.createStatement();
				rs = st.executeQuery(query);
				Taches tach;
				while(rs.next()) {
				tach = new Taches(rs.getString("titre"),rs.getString("description"),rs.getString("status"),rs.getString("deadline"),rs.getString("nom_categorie"));
				listTaches.add(tach);
				
			    }  
				
		    	} catch (Exception e) {
				e.printStackTrace();
			    }
	    	
	    	
	    	    return listTaches;
	            }
	 
	 public void afiche() {
		 
		   // table.getItems().clear();
		 /*
		    titre.setCellValueFactory(new PropertyValueFactory<Taches, String>("Titre"));
			description.setCellValueFactory(new PropertyValueFactory<Taches, String>("Description"));
			status.setCellValueFactory(new PropertyValueFactory<Taches, String>("Status"));
			deadline.setCellValueFactory(new PropertyValueFactory<Taches, String>("Deadline"));
			nom_categorie.setCellValueFactory(new PropertyValueFactory<Taches, String>("nom_categorie"));
			*/
			//table.setItems(listTaches);
		 
	 }
	 
		public void BackBtn(ActionEvent event) throws IOException {
		 Parent  root= FXMLLoader.load(getClass().getResource("login.fxml"));
   	     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     	 Scene scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		
		
	}
	
	
	public void AddTask(ActionEvent event) throws IOException {
		 Parent  root= FXMLLoader.load(getClass().getResource("ADD.fxml"));
  	     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       	 Scene scene = new Scene(root);
         Stage stage = new Stage();            
         stage.setScene(scene);
         stage.show();
	
		
	}
	
	public void deleteTask(ActionEvent event) {
		Taches tach = table.getSelectionModel().getSelectedItem();
     	 TachEmp dao = new TachEmp();
		 dao.DeleteTaches(tach);
		 
//table.getItems().remove(i);
			
		
	}
	
	
	public void UPDate(ActionEvent event) throws IOException {

		Parent  root= FXMLLoader.load(getClass().getResource("UP.fxml"));
 	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	Scene scene = new Scene(root);
        Stage stage = new Stage();            
        stage.setScene(scene);
        stage.show();
	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//afiche();
		titre.setCellValueFactory(new PropertyValueFactory<Taches, String>("Titre"));
		description.setCellValueFactory(new PropertyValueFactory<Taches, String>("Description"));
		status.setCellValueFactory(new PropertyValueFactory<Taches, String>("Status"));
		deadline.setCellValueFactory(new PropertyValueFactory<Taches, String>("Deadline"));
		nom_categorie.setCellValueFactory(new PropertyValueFactory<Taches, String>("nom_categorie"));
		
		try {
			table.setItems(listTaches());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
