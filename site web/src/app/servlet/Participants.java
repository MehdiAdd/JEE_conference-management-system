package app.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ejb.entity.Participant;
import ejb.entity.Session_speciale;
import session.SessionLocal;
 
@WebServlet("/Participants")
public class Participants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(name="SI")
	   SessionLocal metier;
   
    public Participants() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Session_speciale> list_session=metier.listeSessionsAccepte();
		List<Participant> list_participant = metier.listeParticipantsAccepte1();
		List<Participant> list_participant_SessionOrdonnee = metier.listeParticipantsAccepteParAdmin();
		
		 HttpSession session=request.getSession();
		 session.setAttribute("listeParticipant", list_participant);
		 session.setAttribute("listeParticipantSessionOrdonnee", list_participant_SessionOrdonnee);
		 session.setAttribute("listeSession",list_session);
		RequestDispatcher rd=request.getRequestDispatcher("participant.jsp");   
		  
		rd.forward(request, response);
		 	
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
