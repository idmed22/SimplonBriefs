package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import conn.Connect;
import dao.Candidat;
import dao.DaoEmp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SceneController implements Initializable {
	
	

        @FXML
        private TextField id_cand ,nom_cand ,prenom_cand, email_cand, adresse_cand ,ville_cand ,pays_cand;
	
	    @FXML
	    private TableColumn<Candidat, String> adresse;

	    @FXML
	    private TableColumn<Candidat, String> email;

	    @FXML
	    private TableColumn<Candidat, Integer> id;

	    @FXML
	    private TableColumn<Candidat, String> nom;

	    @FXML
	    private TableColumn<Candidat, String> pays;

	    @FXML
	    private TableColumn<Candidat, String> prenom;

	    @FXML
	    private TableView<Candidat> table;

	    @FXML
	    private TableColumn<Candidat, String> ville;
	    
	    @FXML
	    private Button Add_btn;
	    
	    @FXML
	    private Button delete_btn;
	    
	    @FXML
	    private Button update_btn;
	    
	    public void showAlert(Exception e) { 
	        Alert alert = new Alert(Alert.AlertType.INFORMATION);
	        alert.setTitle("Message Here...");
	        alert.setHeaderText("Look, an Information Dialog");
	        alert.setContentText(e.getMessage());
	        alert.showAndWait();
	    }
	   
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			

			try {
				showCandidat();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
        ObservableList<Candidat> listCandidats = FXCollections.observableArrayList();

		public ObservableList<Candidat> getCandidatList() throws ClassNotFoundException{
			
			
	    	Connection connection = Connect.getConnection();
	    	String query = "SELECT * FROM candidat ";
	    	Statement st;
	    	ResultSet rs;
	    	
	    	try {
				

				st = connection.createStatement();
				rs = st.executeQuery(query);
				Candidat cand;
				while(rs.next()) {
					

					cand = new Candidat(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("adresse"),rs.getString("ville"),rs.getString("pays"));
					listCandidats.add(cand);
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	return listCandidats;
	    }
		
		
		public void showCandidat() throws ClassNotFoundException {
			
			table.getItems().clear();

	    	ObservableList<Candidat> list = getCandidatList();
	    	
	    	id.setCellValueFactory(new PropertyValueFactory<Candidat,Integer>("id"));
	    	nom.setCellValueFactory(new PropertyValueFactory<Candidat,String>("Nom"));
	    	prenom.setCellValueFactory(new PropertyValueFactory<Candidat,String>("Prenom"));
	    	email.setCellValueFactory(new PropertyValueFactory<Candidat,String>("Email"));
	    	adresse.setCellValueFactory(new PropertyValueFactory<Candidat,String>("Adresse"));
	    	ville.setCellValueFactory(new PropertyValueFactory<Candidat,String>("Ville"));
	    	pays.setCellValueFactory(new PropertyValueFactory<Candidat,String>("Pays"));
	    	
	    	table.setItems(list);
	    }
		
			
		public void Add_btn() throws ClassNotFoundException{
			
			//String query = "insert into candidat values ("+id_cand.getText()+","+nom_cand.getText()+", "+prenom_cand.getText()
			//+","+email.getText()+","+adresse_cand.getText()+","+ville_cand.getText()+","+pays_cand.getText()+")";
			
			try {
				
				 int id_candidat = Integer.parseInt(id_cand.getText());
				 Candidat cand = new Candidat(id_candidat, nom_cand.getText(), prenom_cand.getText(), email_cand.getText(), adresse_cand.getText(), ville_cand.getText(), pays_cand.getText());
				 DaoEmp daoemp = new  DaoEmp();
		    	 daoemp.addcandidats(cand);
				 showCandidat();

			}catch (Exception e) {
				// TODO: handle exception
				showAlert(e);
			}
			
		}
		public void update_btn() throws ClassNotFoundException{
			
			try {
				
				 int id_candidat = Integer.parseInt(id_cand.getText());
				 Candidat up = new Candidat(id_candidat, nom_cand.getText(), prenom_cand.getText(), email_cand.getText(), adresse_cand.getText(), ville_cand.getText(), pays_cand.getText());
				 DaoEmp daoemp = new  DaoEmp();
		    	 daoemp.updatecandidats(id_candidat, up);
				 showCandidat();
				
				
				
			}catch (Exception e) {
				
				//
			}
			
		}
		public void  delete_btn()throws ClassNotFoundException{
			
			try {
				
				 int id_candidat = Integer.parseInt(id_cand.getText());
				 DaoEmp daoemp = new  DaoEmp();
		    	 daoemp.dropcandidats(id_candidat);
				 showCandidat();
				
			}catch (Exception e) {
				
			}
			
		}
		
}
