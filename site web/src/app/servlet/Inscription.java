package app.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.entity.Listener;
import session.SessionLocal;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   @EJB(name="SI")
	   SessionLocal metier;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 /*String nom=request.getParameter("nom");
		 String prenom=request.getParameter("prenom");
		 String ville=request.getParameter("ville");
		 String email=request.getParameter("email");
		 String etablissement=request.getParameter("etablissement");
	     String titre_academique=request.getParameter("titreAcadimique");
	     Listener listener=new Listener(nom,prenom,ville,email,etablissement,titre_academique);
	     metier.ajouterListener(listener);
	     request.setAttribute("message", "votre inscription est bien faite");
		request.getRequestDispatcher("/registration.jsp").forward(request, response);*/
	}

}
