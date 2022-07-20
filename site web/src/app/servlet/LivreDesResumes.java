package app.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.entity.Fichier;
import session.SessionLocal;

/**
 * Servlet implementation class LivreDesResumes
 */
@WebServlet("/LivreDesResumes")
public class LivreDesResumes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(name="SI")
	   SessionLocal metier;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivreDesResumes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 Fichier livre=metier.downloadFichier("livre");
	  if(livre==null) {
		  request.setAttribute("messageLivre", "le livre nest pas disponible");
		  request.getRequestDispatcher("/callforpaper.jsp").forward(request, response);
	  }else {
	 response.setContentType("application/pdf");
	 response.setHeader("Content-Disposition","filename=\"" + livre.getNom() + ".pdf\""); 
	 OutputStream outs = response.getOutputStream();
	 outs.write(livre.getFichier());
	 // loDocumentDVO.getFileContents() contains byte array of the pdf to display
	 outs.flush();
	 outs.close();
	  }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
