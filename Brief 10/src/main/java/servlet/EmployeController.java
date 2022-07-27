package servlet;

import java.io.IOException;
import dao.EmployDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employe;

//@WebServlet("/EmployeController")
public class EmployeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//private  Employe employe;
	
	public void init() throws ServletException  {
		
		EmployDaoImp empDao = new EmployDaoImp();

		
	}
	
	
	
	  

    public EmployeController() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//request.setAttribute("Employe", employe);

   
	
		request.getRequestDispatcher("login.html").forward(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		double salaire = Double.parseDouble(request.getParameter("salaire")) ;
		String post = request.getParameter("post");
		String typecont = request.getParameter("typecont");
		
		
		Employe emp =new Employe();
		
		emp.setNom(nom);
		emp.setPrenom(prenom);
		emp.setSalaire(salaire);
		emp.setPost(post);
		emp.setTypeCont(typecont);
		
		  try {
				
	            empDao.addEmploye(emp);
				System.out.println(emp.getNom());
				System.out.println(emp.getPrenom());
				System.out.println(emp.getSalaire());
				System.out.println(emp.getPost());
				System.out.println(emp.getTypeCont());
				
				response.sendRedirect("EmployeList.html");
			} catch  (Exception e){
				e.printStackTrace();
				
				System.out.println("Makhdamch");
			}
		
		
		
		
		
		
		
		
		
		

		//doGet(request, response);
	}
	
	
	
	
	
	
	

}
