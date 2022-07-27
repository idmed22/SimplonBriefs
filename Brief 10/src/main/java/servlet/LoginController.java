package servlet;

import java.io.IOException;

import dao.AdminDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  //AdminDaoImp admp = new AdminDaoImp();
	
       
   
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getRequestDispatcher("login.html").forward(request, response);
	    
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    if(username.equals("med") && password.equals("med")) {
	    	
	    	 response.sendRedirect("EmployeList.html");
	    	 
		} else {
			
			response.sendRedirect("login.html");
		
		}
	    
	    /*
	   

         if (admp.validate(username, password)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeList.html");
			dispatcher.forward(request, response);
			
		}else {
			response.sendRedirect("login.html");
			
		}
	      */
	    
		//doGet(request, response);
	}

}
