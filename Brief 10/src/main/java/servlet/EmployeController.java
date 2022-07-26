package servlet;

import java.io.IOException;

import dao.EmployDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/EmployeController")
public class EmployeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//private  Employe employe;
	
	EmployDaoImp employe = new EmployDaoImp();
	
	
	  

    public EmployeController() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//request.setAttribute("Employe", employe);
		request.getRequestDispatcher("EmployeList.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	

}
