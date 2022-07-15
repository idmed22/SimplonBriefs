package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Taches;

import java.io.IOException;

import dao.TacheImplement;

public class AddTasks extends HttpServlet {
	
	TacheImplement tum = new TacheImplement();
	Taches tach = new Taches();
	
	private static final long serialVersionUID = 1L;
   
    public AddTasks() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getRequestDispatcher("AddTasks.jsp").forward(request, response);
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre = request.getParameter("titre");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		String deadline = request.getParameter("deadline");
		String nom_categorie = request.getParameter("nom_categorie");
		
		
		
		tach.setTitre(titre);
		tach.setDescription(description);
		tach.setStatus(status);
		tach.setDeadline(deadline);
		tach.setNom_categorie(nom_categorie);
		
        try {
			
			tum.addTaches(tach);
			
			
			System.out.println(tach.getTitre());
			System.out.println(tach.getDescription());
			System.out.println(tach.getStatus());
			System.out.println(tach.getDeadline());
			System.out.println(tach.getNom_categorie());
			
			response.sendRedirect("TodoApp.jsp");
		} catch  (Exception e){
			e.printStackTrace();
		}
		
		
		//doGet(request, response);
		
		
		
	}

}
