package brief;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		System.out.println("Taper : \n 1 : AddCandidat \n 2 : UpdateCandidat \n 3: DropCandidat ");
		try (Scanner reader = new Scanner(System.in)) {
			int read = reader.nextInt();
		      
		      if(read==1) {
		    	  
		    	  Candidat najib  = new Candidat(11, "rachid", "najib", "najib@anmoon.ma", "1123 agadir", "Agadir", "USA");
		    	  CandidatEmpl candidatEmpl = new  CandidatEmpl();
		    	  candidatEmpl.addcandidats(najib);
		    	  
		    	  
		      } else if(read == 2) {
		    	  
				Candidat med = new Candidat(12,"Med", "ID","med@gmail.com" ,"tam23", "Rabat", "Maroc");
		    	 CandidatEmpl candidatEmpl = new CandidatEmpl();
		    	 candidatEmpl.updatecandidats(3,med);
				
		    	  
		    	
		    	  
		      }else if(read == 3) {
		    	  CandidatEmpl candidatEmpl = new CandidatEmpl();
			    	 candidatEmpl.dropcandidats(4);
		  
		    	  
		    	  
		      }
		}
		     
		      
		  

	}



}
