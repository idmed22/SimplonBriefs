package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Users;

import java.io.IOException;
import dao.UserImplement;


public class Singup extends HttpServlet {
	
	UserImplement ump = new UserImplement();
	Users user = new  Users();
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/WEB-INF/SingUP.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
	
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		
		 
		
		try {
			
			ump.AddUsers(user);
			
			 
			System.out.println(user.getNom());
			System.out.println(user.getPrenom());
			System.out.println(user.getEmail());
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			
			
			response.sendRedirect("login.jsp");
		} catch  (Exception e){
			e.printStackTrace();
		}
		
		
		
		//doGet(request, response);
	}

}
