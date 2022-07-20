package app.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import ejb.entity.Listener;
import ejb.entity.Session_speciale;
import session.SessionLocal;
 
@WebServlet("/Registration")
@MultipartConfig(
        fileSizeThreshold   =  1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15, // 15 MB
        location            = "C:/Users/mehdi/temp"
)
public class Registration extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	   @EJB(name="SI")
	   SessionLocal metier;
   
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Session_speciale> list_session=metier.listeSessionsAccepte();
		 HttpSession session=request.getSession();
		 session.setAttribute("listeSession",list_session);
		 request.setAttribute("message", null);
		RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");   
		  
		rd.forward(request, response);
		 	 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		 String prenom=request.getParameter("prenom");
		 String ville=request.getParameter("ville");
		 String email=request.getParameter("email");
		 String etablissement=request.getParameter("etablissement");
	     String titre_academique=request.getParameter("titreAcadimique");
	     Part file=request.getPart("fichier");
	     String montant=request.getParameter("montant");
	     byte[] imgData=null;
	     InputStream input = file.getInputStream();
	      imgData=new byte[(int) file.getSize()];
	     input.read(imgData);
	     
	     if( file.getSize()==0 || montant.equals("")) {
	    	imgData=null;
	     montant=null;
	     }
	     
	    	
	     
	     
	     Listener listener=new Listener(nom,prenom,ville,email,etablissement,titre_academique,imgData,montant);
	     metier.ajouterListener(listener);
	     request.setAttribute("message", "votre inscription est bien faite");
	     RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");   
		rd.forward(request, response);
	}

}
