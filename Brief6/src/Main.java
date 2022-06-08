import java.sql.Connection;
import java.util.Scanner;

import Conn.Connect;
import categ.CategEmp;
import categ.Categorie;
import produit.ProDao;
import produit.ProdEmp;
import produit.Produit;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection  conn = Connect.getConnection();
		
		
		System.out.println("--------------------------------Gestion Produit && Gategorie--------------------------------");
		
		System.out.println("Taper : \n 1- AddProduit \n 2-  UpdateProduit \n 3- Dropproduit \n 4- AddCategorie \n 5- UpdateCategorie \n 6- DropCategorie " );
		
		System.out.println("_____________________");
		
		 try (Scanner reader = new Scanner(System.in)) {
			int read = reader.nextInt();
	//--------------------------------------------Add Produit----------------------------------------------------
			
			if(read== 1) {
				
			  System.out.println("Enter Produit Name ");
			  Scanner reader1 = new Scanner (System.in);
			  String  read1 = reader1.next();

			  System.out.println("Enter produit ID");
			  Scanner reader2 = new Scanner (System.in);
			  int  read2= reader2.nextInt();
			 
			  System.out.println("Enter produit prix");
			  Scanner reader3 = new Scanner (System.in);
			  int  read5= reader2.nextInt();
			  
			  System.out.println("Enter produit Date");
			  Scanner reader5 = new Scanner (System.in);
			  String  read6= reader2.next();
			  
			  System.out.println("Enter Categorie Id");
			  Scanner reader6 = new Scanner (System.in);
			  int  read7= reader2.nextInt();
			  
			  
			  Produit  apple   = new Produit (read2,read1, read5, read6,read7);
		      ProdEmp   prodemp = new  ProdEmp();
		  	  prodemp.add(apple);
		  	 
		  	 
 //--------------------------------------------------Update-----------------------------------------
		  	  
			}else if(read==2) {
				
				
			  
				  System.out.println("Enter Produit Name ");
				  Scanner reader1 = new Scanner (System.in);
				  String  read1 = reader1.next();

				  System.out.println("Enter produit ID");
				  Scanner reader2 = new Scanner (System.in);
				  int  read2= reader2.nextInt();
				 
				  System.out.println("Enter produit prix");
				  Scanner reader3 = new Scanner (System.in);
				  int  read5= reader2.nextInt();
				  
				  System.out.println("Enter produit Date");
				  Scanner reader5 = new Scanner (System.in);
				  String  read6= reader2.next();
				  
				  System.out.println("Enter Categorie Id");
				  Scanner reader6 = new Scanner (System.in);
				  int  read7= reader2.nextInt();
				  
			      Produit med = new Produit(read2,read1,read5,read6,read7 );
		    	  ProdEmp prodEmp = new ProdEmp();
		    	  prodEmp.updateProduit(med);
				
		
			    
//--------------------------------------------------Drop Produit -----------------------------------------
			    
			}else if(read==3) {
				
				 System.out.println("Enter Id Produit");
				 Scanner reader4 = new Scanner (System.in);
				 int  read2= reader4.nextInt();
				 
				 ProdEmp prodEmp = new ProdEmp();
			     prodEmp.dropProduit(read2);
		  
                   
				
//--------------------------------------------------AddCateg-----------------------------------------
			}else if(read==4) {
				
				System.out.println("Enter ID");
				Scanner reader4= new Scanner (System.in);
				int read22= reader4.nextInt();
				System.out.println("Enter Nom");
			    String  read0= reader4.next();
			    
			    
			    CategEmp   cateemp = new  CategEmp();
			    cateemp.addCategorie(read22,read0);
			  	  
//--------------------------------------------------Update Categ-----------------------------------------
			    
	    	} else if (read==5) {
	    		
	    		System.out.println("Enter ID");
				Scanner reader4= new Scanner (System.in);
				int read22= reader4.nextInt();
				System.out.println("Enter Nom");
			    String  read0= reader4.next();
			    
			    
			    CategEmp   cateemp = new  CategEmp();
			  	cateemp.updateCategorie(read22,read0);
			
			
			
		} else if (read==6) {
			
			    System.out.println("Enter Id Categorie");
			    Scanner reader4 = new Scanner (System.in);
			    int  read22= reader4.nextInt();
			 
			    CategEmp   cateemp = new  CategEmp();
		  	    cateemp.dropCategorie(read22);
			
		   }	
			
	    }	
			  
	}
}
	        
	        

			
		 
	

