package ejb.entity;

import java.io.Serializable;
import java.lang.String;
import java.sql.Blob;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Resume
 *
 */
/*@Entity

public class Resume implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_resume;
	private String titre;
	private String session;
	@Lob
	private byte[] resume;
	private boolean status;
	
	@OneToOne
	private Speakers sp;
	private static final long serialVersionUID = 1L;

	public Resume() {
		super();
	}   
	public int getId_resume() {
		return this.id_resume;
	}

	public void setId_resume(int id_resume) {
		this.id_resume = id_resume;
	}   
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}   
	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}   
	public byte[] getResume() {
		return this.resume;
	}

	public void setResume(byte[] resume) {
		this.resume = resume;
	}   
	public Resume( String titre, String session, byte[] pdfData) {
		super();
		
		this.titre = titre;
		this.session = session;
		this.resume = pdfData;
		
		this.status=false;
	}
	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public Speakers getSp() {
		return sp;
	}
	public void setSp(Speakers sp) {
		this.sp = sp;
	}
 
   
}*/
