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


@WebServlet("/CallForPaper")
public class CallForPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(name="SI")
	   SessionLocal metier;
   
    public CallForPaper() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Session_speciale> list_session=metier.listeSessionsAccepte();
		List<Participant> list_participant = metier.listeParticipantsAccepte();
		 HttpSession session=request.getSession();
		 session.setAttribute("listeParticipant", list_participant);
		 session.setAttribute("listeSession",list_session);
		 request.setAttribute("messageLivre", null);
		 request.setAttribute("messageProgramme", null);
		 request.getRequestDispatcher("/callforpaper.jsp").forward(request, response);
		
		 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
