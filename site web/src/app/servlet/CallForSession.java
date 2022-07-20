package app.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import ejb.entity.Session_speciale;
import session.SessionLocal;

@WebServlet("/CallForSession")
public class CallForSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(name="SI")
	   SessionLocal metier;
  
    public CallForSession() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("message", null);
		RequestDispatcher rd=request.getRequestDispatcher("callforsession.jsp");   
		  
		rd.forward(request, response);
		 	 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nom=request.getParameter("nom");
		 String prenom=request.getParameter("prenom");
		 String password=request.getParameter("password");
		 String email=request.getParameter("email");
		 String etablissement=request.getParameter("etablissement");
	     String titre_academique=request.getParameter("titreAcadimique");
	     String description=request.getParameter("description");
	     String session=request.getParameter("session");
	     System.out.println(session);
	     Session_speciale s=new Session_speciale(session,nom,prenom,email,password,etablissement,titre_academique,description);
	    
     
		metier.ajouterSession(s);
		request.setAttribute("message", "votre demande est envoyé");
		RequestDispatcher rd=request.getRequestDispatcher("callforsession.jsp");   
		  
		rd.forward(request, response);
		
		 }

}
