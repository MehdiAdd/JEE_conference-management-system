package app.servlet;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.entity.Fichier;
import session.SessionLocal;

/**
 * Servlet implementation class GetProgramme
 */
@WebServlet("/GetProgramme")
public class Programme_conference extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB(name="SI")
	   SessionLocal metier;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Programme_conference() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fichier programme=metier.downloadFichier("programme");
		/* response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String filename = programme.getNom(); 
		 
		  response.setContentType("APPLICATION/OCTET-STREAM"); 
		  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + ".pdf\""); 
          /* InputStream input=new ByteArrayInputStream(programme.getFichier());
		  
		  
		  int i; 
		  while ((i=input.read()) != -1) {
		    out.write(i); 
		  } 
		  input.close(); 
		  out.close(); */
		  if(programme==null) {
			  request.setAttribute("messageProgramme", "le livre nest pas disponible");
			  request.getRequestDispatcher("/callforpaper.jsp").forward(request, response);
		  }else {
		  response.setContentType("application/pdf");
		  response.setHeader("Content-Disposition","filename=\"" + programme.getNom() + ".pdf\""); 
		  OutputStream outs = response.getOutputStream();
		  outs.write(programme.getFichier());
		  // loDocumentDVO.getFileContents() contains byte array of the pdf to display
		  outs.flush();
		  outs.close();
		  }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
