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



public class ControllerUP  implements Initializable{
	    @FXML
	    private ChoiceBox<String> ChoiceBoxCateg;

	    @FXML
	    private ChoiceBox<String> ChoiceBoxStat;

	    @FXML
	    private TextField id_Deadline;

	    @FXML
	    private TextField id_description;

	    @FXML
	    private TextField id_titre;
	    

	       String[] statu = {"Pas encore","En cours","Terminé"};
	    
	       String[] categ = {"Présentation","Veille","Recherche"};
	       
	       
	       
	       public void UPDateTa(ActionEvent event) {
	    	   try {
	    		   Taches tach = new Taches(id_titre.getText(), id_description.getText(), ChoiceBoxStat.getValue(), id_Deadline.getText(), ChoiceBoxCateg.getValue());
					 TachEmp tachemp = new  TachEmp();
					 tachemp.updateTaches(tach);
	    	   } catch (Exception e) {
	   			// TODO: handle exception
	   			
	   		}
	    	     
	       }
	    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if(ChoiceBoxStat !=null  && ChoiceBoxCateg !=null) {
			ChoiceBoxStat.getItems().addAll(statu);
			ChoiceBoxStat.setValue(statu[0]);
			ChoiceBoxCateg.getItems().addAll(categ);
			ChoiceBoxCateg.setValue(categ[0]);
    	}
		
	}

}
