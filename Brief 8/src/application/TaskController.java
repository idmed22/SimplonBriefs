package application;

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
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TaskController implements Initializable {
	
	
	
	    @FXML
	    private TableColumn<Taches, String> nom_categorie;

	    @FXML
	    private TableColumn<Taches,String > deadline;

	    @FXML
	    private TableColumn<Taches, String> description;

	    @FXML
	    private TableColumn<Taches, String> status;

	    @FXML
	    private TableView<Taches> table;

	    @FXML
	    private TableColumn<Taches, String> titre;
	    
	    @FXML
	    private ChoiceBox<String> categChoiceBox;
	    
	    @FXML
	    private ChoiceBox<String> statuChoiceBox;
	    
	    @FXML
	    private TextField deadlineInput;
	    
	    @FXML
	    private TextField descriptionInput;
	    
	    @FXML
	    private TextField titreInput;
	    
	    
	    private String[] statu = {"Pas encore","En cours","Terminé"};
	    
	    private String[] Categ = {"Présentation","Veille","Recherche"};
	    
	   
	    
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
     
        public void showTaskAdd() throws ClassNotFoundException {
			
			table.getItems().clear();

	    	ObservableList<Taches> list = listTaches();
	    	
	    	titre.setCellValueFactory(new PropertyValueFactory<Taches,String>("Titre"));
	    	description.setCellValueFactory(new PropertyValueFactory<Taches,String>("Description"));
	    	status.setCellValueFactory(new PropertyValueFactory<Taches,String>("Status"));
	    	deadline.setCellValueFactory(new PropertyValueFactory<Taches,String>("Deadline"));
	    	nom_categorie.setCellValueFactory(new PropertyValueFactory<Taches,String>("nom_categorie"));
	    
	    	
	      	table.setItems(list);
	        }
	
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		try {
			
			titre.setCellValueFactory(new PropertyValueFactory<Taches, String>("Titre"));
			description.setCellValueFactory(new PropertyValueFactory<Taches, String>("Description"));
			status.setCellValueFactory(new PropertyValueFactory<Taches, String>("Status"));
			deadline.setCellValueFactory(new PropertyValueFactory<Taches, String>("Deadline"));
			nom_categorie.setCellValueFactory(new PropertyValueFactory<Taches, String>("Categorie"));
			
			statuChoiceBox.getItems().addAll(statu);
			categChoiceBox.getItems().addAll(Categ);
			
			showTaskAdd();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	    public void AddTache(ActionEvent event){
		
		try {
			
			 Taches tach = new Taches(titreInput.getText(), descriptionInput.getText(), statuChoiceBox.getValue(), deadlineInput.getText(), categChoiceBox.getValue());
			 TachEmp tachemp = new  TachEmp();
			 tachemp.addTaches(tach);
	    	 showTaskAdd();

		}catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}
	
	
	    public void UpDaTache(ActionEvent event) {
		
		try {
			
			 Taches tach = new Taches(titreInput.getText(), descriptionInput.getText(), statuChoiceBox.getValue(), deadlineInput.getText(), categChoiceBox.getValue());
			 TachEmp tachemp = new  TachEmp();
			 tachemp.updateTaches(tach);
			 showTaskAdd();
			 

		}catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		
	}
	 
	    public void DeleTache(ActionEvent event) {
		
		
		try {
		
			 TachEmp dao = new TachEmp();
			 Taches task = new  Taches(titreInput.getText());
			 dao.DeleteTaches(task);
			 showTaskAdd();
			 //table.getItems().remove(table.getSelectionModel().getSelectedItem());// work
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		
		
		
		
	}
	

}
