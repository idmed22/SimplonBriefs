package application;

import java.net.URL;
import java.util.ResourceBundle;

import dao.TachEmp;
import dao.Taches;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ControllerAdd implements Initializable{
	
	    @FXML
	    private ChoiceBox<String> ChoiceBoxCateg;

	    @FXML
	    private ChoiceBox<String> ChoiceBoxStatu;

	    @FXML
	    private TextField deadlin_input;

	    @FXML
	    private TextField descrip_input;

	    @FXML
	    private TextField titre_input;
	    
	  
	  
       String[] statu = {"Pas encore","En cours","Terminé"};
    
       String[] categ = {"Présentation","Veille","Recherche"};
    
       
	
	public void AddTask(ActionEvent event) {
		try {
			
			 Taches tach = new Taches(titre_input.getText(), descrip_input.getText(), ChoiceBoxStatu.getValue(), deadlin_input.getText(), ChoiceBoxCateg.getValue());
			 TachEmp tachemp = new  TachEmp();
			 tachemp.addTaches(tach);
			

		}catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if(ChoiceBoxStatu !=null  && ChoiceBoxCateg !=null) {
			ChoiceBoxStatu.getItems().addAll(statu);
			ChoiceBoxStatu.setValue(statu[0]);
			ChoiceBoxCateg.getItems().addAll(categ);
			ChoiceBoxCateg.setValue(categ[0]);
    	}
		
	}
	
}
