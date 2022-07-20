package app.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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

import ejb.entity.Participant;
import ejb.entity.Session_speciale;
import session.SessionLocal;
 
@WebServlet("/Submission")
@MultipartConfig(
        fileSizeThreshold   =  1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15, // 15 MB
        location            = "C:/Users/mehdi/temp"
)
public class Submission extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(name="SI")
	   SessionLocal metier;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Submission() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Session_speciale> list_session=metier.listeSessionsAccepte();
		 HttpSession session=request.getSession();
		 session.setAttribute("listeSession",list_session);
		 request.setAttribute("message", null);
		RequestDispatcher rd=request.getRequestDispatcher("submission.jsp");   
		  
		rd.forward(request, response);
		 	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nom=request.getParameter("nom");
		 String prenom=request.getParameter("prenom");
		 String ville=request.getParameter("ville");
		 String email=request.getParameter("email");
		 String etablissement=request.getParameter("etablissement");
	     String titre_academique=request.getParameter("titreAcadimique");
	    
	     String session=request.getParameter("session");
	     String titre=request.getParameter("titreDeFichier");
	     Part file=request.getPart("fichier");
	     InputStream input = file.getInputStream();
	     byte[] pdfData=new byte[(int) file.getSize()];
	     input.read(pdfData);
	   
	     Participant speaker=new Participant(nom,prenom,ville,etablissement,email,titre_academique,titre,session,pdfData);
	     metier.ajouterParticipant(speaker);
	     request.setAttribute("message", "votre travail est envoyé");
	     RequestDispatcher rd=request.getRequestDispatcher("submission.jsp");
	     rd.forward(request, response);
		 	}

}
